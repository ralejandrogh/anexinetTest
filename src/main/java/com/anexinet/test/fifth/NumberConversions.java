package com.anexinet.test.fifth;

import com.anexinet.test.fifth.exceptions.NumberOutOfRangeException;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberConversions {

    private static LinkedHashMap<String, Integer> romanDecimalMap;

    public static String getRomanNumeral(int decimalNumber) throws NumberOutOfRangeException {
        if (decimalNumber < 1 || decimalNumber > 3999)
            throw new NumberOutOfRangeException("The Number can only be between 1 and 3999");

        String romanNumeral = "";
        for (Map.Entry<String, Integer> entry : mapInitialization().entrySet()) {
            //Verifying if integer number belongs within a roman numeral through arithmetic division
            int timesContained = (decimalNumber / entry.getValue());
            if (timesContained > 0) {
                romanNumeral = romanNumeral.concat(generateRomanLetter(entry.getKey(), timesContained));
                decimalNumber = (decimalNumber % entry.getValue());
                if (decimalNumber == 0)
                    break;
            }
        }
        return romanNumeral;
    }

    private static String generateRomanLetter(String romanLetter, int timesContained) {
        StringBuilder sB = new StringBuilder();

        //According to the number of times that the integer parameter is contained in the roman numeral, the roman letter
        //is appended to the string
        for (int i = 0; i < timesContained; i++)
            sB.append(romanLetter);

        return sB.toString();
    }

    private static LinkedHashMap<String, Integer> mapInitialization() {
        romanDecimalMap = new LinkedHashMap<>();
        romanDecimalMap.put("M", 1000);
        romanDecimalMap.put("CM", 900);
        romanDecimalMap.put("D", 500);
        romanDecimalMap.put("CD", 400);
        romanDecimalMap.put("C", 100);
        romanDecimalMap.put("XC", 90);
        romanDecimalMap.put("L", 50);
        romanDecimalMap.put("XL", 40);
        romanDecimalMap.put("X", 10);
        romanDecimalMap.put("IX", 9);
        romanDecimalMap.put("V", 5);
        romanDecimalMap.put("IV", 4);
        romanDecimalMap.put("I", 1);
        return romanDecimalMap;
    }
}
