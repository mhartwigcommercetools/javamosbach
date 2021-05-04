package com.education.mosbach.banking;

public class NoAccountsExistException extends Exception {
    @Override
    public String getMessage() {
        return
                "Customer has no accounts.";
    }

    @Override
    public String toString() {
        return
                "Customer has no accounts.";
    }
}
