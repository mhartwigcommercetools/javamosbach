package com.education.mosbach.algorithms.maths;

import java.util.Optional;

public class Fraction {

    private int nominator = 1;
    private int denominator = 1;

    public Optional<Double> getDecimalWithoutExceptions() {
        return
                Optional.of(Double.parseDouble("2345"));
    }




    // TODO: Diese Methode muss getestet werden.
    //
    public double getDecimal() {
        return
                Double.parseDouble("" + getNominator())
                        /
                Double.parseDouble("" + getDenominator());
    }


    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws DivisionByZeroException {
        // 1. Behandeln (oder hier eher ignorieren)
        // if (denominator == 0) return;       // aber wenigstens loggen

        // 2. Exception werfen bereits definierte
        // if (denominator == 0) {
        //     throw new NumberFormatException("Division by Zero is forbidden.");
        // }

        // 3. Eigene Exception werfen
        if (denominator == 0)
            throw new DivisionByZeroException();

        this.denominator = denominator;

    }

    @Override
    public String toString() {
        return
                getNominator() + "/"  + getDenominator();
    }
}
