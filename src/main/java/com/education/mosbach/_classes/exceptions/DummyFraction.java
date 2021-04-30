package com.education.mosbach._classes.exceptions;

import com.education.mosbach.algorithms.maths.DivisionByZeroException;
import com.education.mosbach.algorithms.maths.Fraction;

public class DummyFraction {

    public static void main(String[] args) {

        /*
        Fraction myFraction1 = new Fraction(1,1);
        System.out.println(myFraction1 + " -> " + myFraction1.getDecimal());
        Fraction myFraction2 = new Fraction(2,3);
        System.out.println(myFraction2 + " -> " + myFraction2.getDecimal());
        */

        Fraction myFraction3 = new Fraction();
        myFraction3.setNominator(1);

        try {
            myFraction3.setDenominator(3);
            System.out.println(myFraction3 + " -> " + myFraction3.getDecimal());
        }
        catch (DivisionByZeroException e) {
            e.printStackTrace();
        }


        try {
            myFraction3.setDenominator(0);
            System.out.println(myFraction3 + " -> " + myFraction3.getDecimal());
        }
        catch (DivisionByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Fraction was not changed.");
        }
/*
        Optional<Double> d;
        if (d.isPresent())
*/
        // System.out.println("int" + (2/0));
    }

}
