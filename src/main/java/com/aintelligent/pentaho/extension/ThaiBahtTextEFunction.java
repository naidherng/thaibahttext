/*
 * @created June 18, 2015
 * @author Kaigratok Manop
 */
package com.aintelligent.pentaho.extension;

import org.pentaho.reporting.libraries.formula.EvaluationException;
import org.pentaho.reporting.libraries.formula.FormulaContext;
import org.pentaho.reporting.libraries.formula.LibFormulaErrorValue;
import org.pentaho.reporting.libraries.formula.function.Function;
import org.pentaho.reporting.libraries.formula.function.ParameterCallback;
import org.pentaho.reporting.libraries.formula.lvalues.TypeValuePair;
import org.pentaho.reporting.libraries.formula.typing.Type;
import org.pentaho.reporting.libraries.formula.typing.coretypes.TextType;

/**
 * This class provides a implementing
 * a LibFormula function.
 *
 */

public class ThaiBahtTextEFunction implements Function {

  private static final long serialVersionUID = 4984027687466610132L;

  public ThaiBahtTextEFunction() {
    // Constructor
  }

  /* (non-Javadoc)
   * @see org.pentaho.reporting.libraries.formula.function.Function#evaluate(org.pentaho.reporting.libraries.formula.FormulaContext, org.pentaho.reporting.libraries.formula.function.ParameterCallback)
   */
  public TypeValuePair evaluate(FormulaContext context, ParameterCallback parameters) throws EvaluationException {
    final int parameterCount = parameters.getParameterCount();
    if (parameterCount < 1) {
      throw new EvaluationException(LibFormulaErrorValue.ERROR_ARGUMENTS_VALUE);
    }
    final Type type1 = parameters.getType(0);
    final Object value1 = parameters.getValue(0);
    final Number result = context.getTypeRegistry().convertToNumber(type1, value1);
    if ( (result == null) || (result.intValue() < 0)) {
      throw new EvaluationException(LibFormulaErrorValue.ERROR_INVALID_ARGUMENT_VALUE);
    }

    String engtext = "";
    engtext = EnglishNumberToWords.convert(result.doubleValue(), true) ;

    return new TypeValuePair(TextType.TYPE, engtext);
  }

  /* (non-Javadoc)
   * @see org.pentaho.reporting.libraries.formula.function.Function#getCanonicalName()
   */
  public String getCanonicalName() {
    return "THAIBAHTTEXTE";
  }

}
