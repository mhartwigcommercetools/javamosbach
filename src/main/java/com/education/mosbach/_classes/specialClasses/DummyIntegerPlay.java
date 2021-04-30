package com.education.mosbach._classes.specialClasses;

import java.math.BigInteger;

public class DummyIntegerPlay {

    public static void main(String[] args) {

        // Erhoehe eine Zahl bis es Unsinn wird
        int i = 1;
        while (i > 0) {
            i *= 2;
            System.out.println("Zahl i ist " + i);
        }

        Integer intNumber = 1;
        while (intNumber > 0) {
            intNumber *= 2;
            System.out.println("Zahl intNumber ist " + intNumber);
        }

        // BigInteger bigInteger = new BigInteger("1");
        BigInteger bigInteger = BigInteger.ONE;
        while (bigInteger.longValue() > 0) {
            bigInteger = bigInteger.multiply(BigInteger.TWO);
            System.out.println("Zahl bigInteger ist " + bigInteger.longValue());
        }
    }
}
