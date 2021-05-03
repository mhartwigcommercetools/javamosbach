package com.education.mosbach.banking;

public class Customer {

    private int customerID;
    private String firstName;
    private String lastName;
    private String city;

    public Customer(int customerID, String firstName, String lastName, String city) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
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
    public String toString() {
        return getLastName() + ", " + getFirstName() + " aus " + getCity();
    }

}
