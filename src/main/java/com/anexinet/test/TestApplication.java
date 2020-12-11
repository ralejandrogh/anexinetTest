package com.anexinet.test;

import com.anexinet.test.fifth.NumberConversions;
import com.anexinet.test.fifth.exceptions.NumberOutOfRangeException;
import com.anexinet.test.first.Arithmetic;
import com.anexinet.test.second.StringOperations;
import com.anexinet.test.second.exceptions.StringRepeatedException;
import com.anexinet.test.seventh.StringTransactions;
import com.anexinet.test.sixth.Permutations;
import com.anexinet.test.sixth.exception.StringLenghtException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestApplication {

    public static void main(String[] args) {

        System.out.println("1. Write a function that adds two numbers without using any arithmetic operators: " +
                Arithmetic.sumNumberWithoutArithmeticOperators(-1, 2));

        try {
            System.out.println("2. Given 2 strings of unknown characters (but it cannot be repeated) create a function " +
                    "that returns an array of the characters that are repeated in both strings in the most efficient way: " +
                    new String(StringOperations.getRepeatedCharacters("StringTest1",
                            "CharacterSet1")));

        } catch (StringRepeatedException | NullPointerException e1) {
            log.error("Error in question number 2 {}", e1.getMessage());
        }

        try {
            System.out.println("5. Write a function that convert the given number into a Roman Numeral - The function needs " +
                    "to receive a Number and Return a String (The Number can be between 1 and 3999): " +
                    NumberConversions.getRomanNumeral(567));
        } catch (NumberOutOfRangeException e2) {
            log.error("Error in question number 5 {}", e2.getMessage());
        }

        try {
            System.out.println("6. Write a function to print all permutations of a string. Max string length can be 50 " +
                    "characters: ");
            Permutations.generateStringPermutations("123");
        } catch (StringLenghtException e3) {
            log.error("Error in question number 6 {}", e3.getMessage());

        }try {
            System.out.println("7. Write a function that receives a sentence, and return the longest word, if two or more words has the same lenght, they are returned as an array, but can't return\n" +
                    "duplicated words: ");
            for(Object obj : StringTransactions.getLongestWords("a bb ccc ddd eeee"))
                System.out.println((String) obj);
        } catch (StringLenghtException e4) {
            log.error("Error in question number 7 {}", e4.getMessage());
        }


    }

}
