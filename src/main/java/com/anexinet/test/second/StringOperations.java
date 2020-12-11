package com.anexinet.test.second;

import com.anexinet.test.second.exceptions.StringRepeatedException;

import java.util.HashSet;
import java.util.Set;

public class StringOperations {
    public static char[] getRepeatedCharacters(String first, String second) throws StringRepeatedException {

        if(first == null || second == null)
            throw new NullPointerException("Input strings must not be null");
        if (first.trim().equalsIgnoreCase(second.trim()))
            throw new StringRepeatedException("First string must not be equal to the second");

        //String treatment to equal both strings in matter of letter case
        String treatedFirstString = first.toLowerCase().trim();
        String treatedSecondString = second.toLowerCase().trim();

        Set<Character> secondStringCharacterSet = new HashSet<>();
        StringBuilder comparisonResult = new StringBuilder();

        //Storing the second string's (non repeated) characters in a Set Collection for later comparison
        for (char character : treatedSecondString.toCharArray())
            secondStringCharacterSet.add(character);

        //Iteration of the first string's char array to compare each element of it against the previous Set Collection
        // in order to find the common characters  between both strings and store those characters into a StringBuilder
        for (char firstStringCharacter : treatedFirstString.toCharArray())
            if (secondStringCharacterSet.contains(firstStringCharacter))
                comparisonResult.append(firstStringCharacter);


        return comparisonResult.toString().toCharArray();
    }
}
