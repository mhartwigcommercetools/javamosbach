package com.education.mosbach._classes.repetition;

import com.education.mosbach.banking.Account;
import com.education.mosbach.banking.Bank;
import com.education.mosbach.banking.Customer;

public class DummyToPlayBank {

    public static void main(String[] args) {

        Bank bank1 = new Bank("Volksbank Brackenheim","Brackenheim");

        Customer customer1 = new Customer(5678,"Hans","Müller","Brackenheim");
        Customer customer2 = new Customer(5679,"Helena","Schmidt","Güglingen");
        Customer customer3 = new Customer(5680,"Alex","Müller","Schwaigern");

        Account account1 = new Account(5678,"DE23620632630203347001", 1000,500);
        Account account2 = new Account(5678,"DE23620632630203347061", 1000,0);
        Account account3 = new Account(5679,"DE23620632630203323004", 1000,1500);
        Account account4 = new Account(5679,"DE23620632630203323401", 1000,0);
        Account account5 = new Account(5680,"DE23620632630203454011", 1000,2000);

        account1.update(100);
        account1.update(1000);
        account2.update(30);
        account5.update(-4000);

        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);
        bank1.addCustomer(customer3);

        System.out.println("Sortieren, dann Printout über Bank.toString");
        bank1.sort();
        System.out.println(bank1);

        System.out.println("Sortieren über Comparator, dann Printout über Bank.toString");
        bank1.sort2();
        System.out.println(bank1);

        System.out.println("Customer mit der ID 5679 ist nach linearer Suche " +
                bank1.findCustomerLinear(5679)
        );
        System.out.println("Customer mit der ID 5679 ist nach binärer Suche " +
                bank1.findCustomerLinear(5679)
        );

    }
}
