/*
 * @created June 18, 2015
 * @author Kaigratok Manop
 */
package com.aintelligent.pentaho.extension;

import org.pentaho.reporting.libraries.formula.function.AbstractFunctionDescription;
import org.pentaho.reporting.libraries.formula.function.FunctionCategory;
import org.pentaho.reporting.libraries.formula.function.information.InformationFunctionCategory;
import org.pentaho.reporting.libraries.formula.typing.Type;
import org.pentaho.reporting.libraries.formula.typing.coretypes.NumberType;
import org.pentaho.reporting.libraries.formula.typing.coretypes.TextType;

/**
 * This class describes the  ThaiBahtText function.
 *
 */
public class ThaiBahtTextFunctionDescription extends AbstractFunctionDescription {

  private static final long serialVersionUID = 2368106667495213328L;

  public ThaiBahtTextFunctionDescription() {
    super("THAIBAHTTEXT", "com.aintelligent.pentaho.extension.ThaiBahtText-Function");
  }

  public FunctionCategory getCategory() {
    return InformationFunctionCategory.CATEGORY;
  }

  public int getParameterCount() {
    return 1; // 1 Parameter - value of baht
  }

  public Type getParameterType(int position) {
    return NumberType.GENERIC_NUMBER;
  }

  public Type getValueType() {
    return TextType.TYPE;
  }

  public boolean isParameterMandatory(int position) {
    return true;
  }

}
