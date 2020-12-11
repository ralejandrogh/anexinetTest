package com.anexinet.test.first;

public class Arithmetic {

    //Using bitwise operators along with recursiveness. The recursive method cycle will break
    //until there is no more arithmetic carry provided to the method as parameter "b".
    public static int sumNumberWithoutArithmeticOperators(int a, int b) {
        if (b == 0)
            return a;

        //XOR operator for sum of bits; AND operator to calculate arithmetic carry.
        //"<<" left shift operator to calculate sum through shifting arithmetic carry by 1.
        return sumNumberWithoutArithmeticOperators(a ^ b, (a & b) << 1);
    }

}
