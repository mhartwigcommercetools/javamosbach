package com.education.mosbach._classes.exceptions;

public class DummyRandomExceptionsPlay {

    public static void main(String[] args) {
        FunnyRandomExceptionThrower funnyRandomExceptionThrower
                = new FunnyRandomExceptionThrower();
        try {
            funnyRandomExceptionThrower.throwRandomException();
        }
        catch ( NumberFormatException e ) {
            System.out.println("Es war eine NumberFormatException");
        }
        catch ( ArithmeticException e) {
            System.out.println("Es war eine ArithmeticException");
        }
        // Mal ausprobieren, kann man nicht nach oben schieben.
        //
        catch ( RuntimeException e) {
            System.out.println("Es war eine RuntimeException");
        }
    }
}
