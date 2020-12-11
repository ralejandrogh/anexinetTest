package com.anexinet.test.sixth;

import com.anexinet.test.sixth.exception.StringLenghtException;

public class Permutations {

    public static void generateStringPermutations(String inputString) throws StringLenghtException {

        if (inputString == null || inputString.isEmpty() || inputString.length() > 50)
            throw new StringLenghtException("String length must be between 1 - 50 characters");

        //Using empty prefix as starting point
        String prefix = "";
        generateStringPermutations(prefix, inputString);
    }

    //Using recursiveness to iterate the input string, character by character, from 0 to string length and storing the
    //result in the concatenated (by index per cycle) prefix variable, while using substring to reduce the input
    // string's length, this allows to know when to print a permutation due that length will reach 0.
    private static void generateStringPermutations(String prefix, String inputString) {

        int inputLength = inputString.length();
        if (inputLength == 0)
            System.out.println(prefix);

        for (int i = 0; i < inputLength; i++)
            generateStringPermutations(prefix.concat(String.valueOf(inputString.charAt(i))),
                    inputString.substring(0, i).concat(inputString.substring(i + 1, inputLength)));

    }
}
