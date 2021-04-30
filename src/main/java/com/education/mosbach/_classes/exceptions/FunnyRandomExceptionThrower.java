package com.education.mosbach._classes.exceptions;

import java.util.Random;

public class FunnyRandomExceptionThrower {

    public void throwRandomException() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case  0: throw new ArithmeticException();
            case  1: throw new NumberFormatException();
            case  2: throw new RuntimeException();
            default: break;
        }
    }
}
