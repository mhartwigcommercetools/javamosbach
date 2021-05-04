package com.education.mosbach.banking;

import java.math.BigInteger;
import java.util.List;

public class Customer implements Comparable {

    private int customerID;
    private String firstName;
    private String lastName;
    private String city;
    private AccountDetailsFetcher accountDetailsFetcher;

    public Customer(int customerID, String firstName, String lastName, String city, AccountDetailsFetcher accountDetailsFetcher) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.accountDetailsFetcher = accountDetailsFetcher;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Customer)) return false;
        return
                customerID == ((Customer) o).customerID;
    }

    @Override
    public int hashCode(){
        return
                getCustomerID() % 100;
    }

    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName() + " aus " + getCity();
    }

    @Override
    public int compareTo(Object o){

        Customer otherCustomer = (Customer) o;

        BigInteger sumOfMyBalances = BigInteger.ZERO;
        try {
            for (Account a: accountDetailsFetcher.fetchMyAccounts(customerID))
                sumOfMyBalances = sumOfMyBalances.add(
                        new BigInteger("" + a.getBalance())
                );
        } catch (NoAccountsExistException e) {
            System.out.println("Customer " + customerID + " has no accounts. Exception: " + e.getMessage());
        }

        BigInteger sumOfOtherBalances = BigInteger.ZERO;
        try {
            for (Account a: accountDetailsFetcher.fetchMyAccounts(otherCustomer.getCustomerID()))
                sumOfOtherBalances = sumOfOtherBalances.add(
                        new BigInteger("" + a.getBalance())
                );
        } catch (NoAccountsExistException e) {
            System.out.println("Customer " + otherCustomer.getCustomerID() + " has no accounts. Exception: " + e.getMessage());
        }
        return
                sumOfMyBalances.compareTo(sumOfOtherBalances);
    }
}
