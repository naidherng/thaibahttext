package com.aintelligent.pentaho.extension;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest 
{
    @Test
    public void doTestEnglishNumberToWords()
    {
        assertEquals("Wrong Text","zero", EnglishNumberToWords.convert(0, false));
        assertEquals("Wrong Text","zero baht", EnglishNumberToWords.convert(0, true));
        assertEquals("Wrong Text","zero baht and ninety nine satang", EnglishNumberToWords.convert(0.99, true));
        assertEquals("Wrong Text","one", EnglishNumberToWords.convert(1.0, false));
        assertEquals("Wrong Text","one baht", EnglishNumberToWords.convert(1.0, true));
        assertEquals("Wrong Text","one and three cents", EnglishNumberToWords.convert(1.03, false));
        assertEquals("Wrong Text","three", EnglishNumberToWords.convert(3, false));
        assertEquals("Wrong Text","sixty and seven baht", EnglishNumberToWords.convert(67, true));
        assertEquals("Wrong Text","one hundred and eighteen", EnglishNumberToWords.convert(118, false));
        assertEquals("Wrong Text","one hundred forty five million six hundred eighty seven thousand one hundred and nineteen baht", EnglishNumberToWords.convert(145687119, true));
        assertEquals("Wrong Text","one hundred nineteen baht and thirteen satang", EnglishNumberToWords.convert(119.125, true));
        assertEquals("Wrong Text","one hundred nineteen and twenty six cents", EnglishNumberToWords.convert(119.261, false));
        assertEquals("Wrong Text","three hundred baht and one satang", EnglishNumberToWords.convert(300.01, true));
    }

    @Test
    public void doTestThaiBahtText()
    {
        ThaiBahtText tb  = new ThaiBahtText();
        assertEquals("Wrong Text","หนึ่งบาทถ้วน", tb.getText(1));
        assertEquals("Wrong Text","หนึ่งร้อยห้าสิบห้าบาทสิบเก้าสตางค์", tb.getText(155.19));
        assertEquals("Wrong Text","เก้าสิบแปดล้านสามแสนสี่หมื่นห้าพันหนึ่งร้อยห้าสิบห้าบาทแปดสิบสี่สตางค์", tb.getText(98345155.84));
    }
}
