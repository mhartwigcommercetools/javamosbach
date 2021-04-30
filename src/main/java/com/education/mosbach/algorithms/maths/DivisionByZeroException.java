package com.education.mosbach.algorithms.maths;

public class DivisionByZeroException extends Exception {
    @Override
    public String getMessage() {
        return
                "Division by 0 is forbidden.";
    }

    @Override
    public String toString() {
        return
                "Division by 0 is forbidden.";
    }
}
