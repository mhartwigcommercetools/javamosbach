package com.education.mosbach.banking;

import com.education.mosbach.humanresources.staff.Staff;
import org.checkerframework.checker.units.qual.A;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {

    private String name;
    private String ort;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String name, String ort) {
        this.name = name;
        this.ort = ort;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    private void swap(List<Customer> A, int pos1, int pos2){
        Customer temp = A.get(pos1);
        A.set(pos1, A.get(pos2));
        A.set(pos2, temp);
    }

    // TODO: SelectionSort
    // Code is buggy, sortiert wird nach Nachnamen, aber nicht dann nach Vornamen
    public void sort() {
        List<Customer> unsorted = customers;

        for (int j = 0; j < 2; j++) {
            for (int actPos = 0; actPos < (unsorted.size() - 1); actPos++) {
                int minPos = actPos;
                for (int i = actPos + 1; i < unsorted.size(); i++) {
                    if (j == 0)
                        if (unsorted.get(minPos).getLastName()
                                .compareToIgnoreCase(
                                        unsorted.get(i).getLastName()
                                ) > 0
                        )
                            minPos = i;
                        else if (j == 1)
                            if (unsorted.get(minPos).getFirstName()
                                    .compareToIgnoreCase(
                                            unsorted.get(i).getFirstName()
                                    ) > 0
                            )
                                minPos = i;
                }
                swap(unsorted, actPos, minPos);
            }
        }
        customers = unsorted;
    }

    public void sort2() {
        customers.sort(Comparator
                .comparing(Customer::getLastName)
                .thenComparing(Customer::getFirstName)
        );
    }

    public void sortById() {
        customers.sort(Comparator
                .comparing(Customer::getCustomerID)
        );
    }

    public Customer findCustomerLinear(int customerID) {
            for (Customer c : customers)
                if (c.getCustomerID() == customerID)
                    return c;
            return null;
    }

    public Customer search(int start, int end, int customerID) {

        if (start == end) return customers.get(start);
        int pivot = start + ((end - start) / 2);

        if (customerID == customers.get(pivot).getCustomerID())
            return customers.get(pivot);
        if (customerID < customers.get(pivot).getCustomerID())
            return search(start, pivot-1, customerID);
        else
            return search(pivot+1, end, customerID);
    }

    public Customer findCustomerBinary(int customerID) {
        sortById();
        return
                search(0, customers.size(), customerID);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bank: " + getName() + "\n");
        for (Customer c : customers)
            sb.append(c.getLastName() + " " + c.getFirstName() + "\n");
        return
                sb.toString();
    }
}
