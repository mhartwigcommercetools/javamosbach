package com.education.mosbach._classes.repetition;

import com.education.mosbach.banking.Account;
import com.education.mosbach.banking.Bank;
import com.education.mosbach.banking.Customer;

import java.util.List;

public class DummyToPlayBank {

    public static void main(String[] args) {

        Bank bank1 = new Bank("Volksbank Brackenheim","Brackenheim");

        Customer customer1 = new Customer(5678,"Hans","Müller","Brackenheim", bank1);
        Customer customer2 = new Customer(5679,"Helena","Schmidt","Güglingen", bank1);
        Customer customer3 = new Customer(5680,"Alex","Müller","Schwaigern", bank1);

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

        bank1.addAccounts(account1);
        bank1.addAccounts(account2);
        bank1.addAccounts(account3);
        bank1.addAccounts(account4);
        bank1.addAccounts(account5);

        final List snapshot = bank1.createSnapshot();
        snapshot.forEach(System.out::println);
        System.out.println("Die Konten ergeben einen Stand: " + bank1.getBankBalance().longValue());

        System.out.println("Vergleich Konto 1 mit 2:" + account1.compareTo(account2));
        System.out.println("Vergleich Konto 3 mit 4:" + account3.compareTo(account4));
        System.out.println("Vergleich Konto 5 mit 1:" + account5.compareTo(account1));

        System.out.println("Vergleich Kunde 1 mit 2:" + customer1.compareTo(customer2));
        System.out.println("Vergleich Kunde 2 mit 1:" + customer2.compareTo(customer1));
        System.out.println("Vergleich Kunde 1 mit 1:" + customer1.compareTo(customer1));

        Customer customer4 = new Customer(345, "Johann", "Fortdran", "Mosbach", bank1);
        System.out.println("Vergleich Kunde 1 mit 4:" + customer1.compareTo(customer4));


    }
}
