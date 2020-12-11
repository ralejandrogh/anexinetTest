package com.anexinet.test.seventh;

import com.anexinet.test.sixth.exception.StringLenghtException;

import java.util.HashSet;
import java.util.Set;

public class StringTransactions {

    public static Object[] getLongestWords(String sentence) throws StringLenghtException {
        if (sentence == null || sentence.isEmpty())
            throw new StringLenghtException("Sentence must not be null or empty");

        //Determine the length of the largest word in the sentence by the iteration of the array of strings obtained
        //by splitting the input sentence using the " " regex
        int longestLenght = 0;
        for (String currentWord : sentence.trim().split(" "))
            if (currentWord.length() > longestLenght)
                longestLenght = currentWord.length();

        //Looking for the longest words according to the longest length obtained and storing them in a non repeated
        //element collection
        Set<String> longestWords = new HashSet<>();
        for (String currentWord : sentence.trim().split(" "))
            if (currentWord.length() == longestLenght)
                longestWords.add(currentWord);

        return longestWords.toArray();
    }
}
