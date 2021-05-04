package com.education.mosbach.banking;

public class Account implements Comparable {

    private int customerID;
    private String iban;
    private int balance;
    private int credit;

    public Account(int customerID, String iban, int balance, int credit) {
        this.customerID = customerID;
        this.iban = iban;
        this.balance = balance;
        this.credit = credit;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public boolean update(int delta) {
        if ((getBalance() + delta) > (-1 * getCredit())) {
            balance += delta;
            System.out.println("Buchung wurde durchgeführt");
            return true;
        } else {
            System.out.println("Buchung wurde nicht ausgeführt!");
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Account otheraccount = (Account) o;
        if (getBalance() > otheraccount.getBalance()) return 1;
        if (getBalance() == otheraccount.getBalance()) return 0;
        return -1;
    }
}
