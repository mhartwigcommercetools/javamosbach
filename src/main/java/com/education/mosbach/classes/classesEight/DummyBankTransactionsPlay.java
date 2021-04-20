package com.education.mosbach.classes.classesEight;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Michael Hartwig
 * name: Customer
 * Diese Klasse simuliert eine Bank, deren Kunden und Umbuchungen.
 * Es werden Threads verwendet.
 */
public class DummyBankTransactionsPlay {

    static int[] accounts = {1000, 1000, 1000};

    // Einzeilerkommentar

    /*
        Mehrzeilerkommentar
     */

    /**
     * @author Michael Hartwig
     * name: Customer
     * Diese Klasse simuliert einen Kunden, der Umbuchungen an einer Bank vornimmt.
     */
    static class Customer implements Runnable {

        /**
         * name: transfer
         * Diese Methode bucht vom Account from zum Account to den Betrag amount um.
         * @param from Das Konto von dem wir abziehen.
         *
         */
        void transfer(int from, int to, int amount) {
            accounts[from] -= amount;
            accounts[to] += amount;
        }

        @Override
        public void run() {
            Random random = new Random();
            IntStream.iterate(1, value -> value + 1)
                    .limit(100_000)
                    .forEach(value ->
                            transfer(
                                    random.nextInt(3),
                                    random.nextInt(3),
                                    random.nextInt(1000)
                            )
                    );
        }
    }

    static class BankingReport implements Runnable {
        void printReport(int reportNumber) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += accounts[i];
                System.out.println(accounts[i]);
            }
            System.out.println("Summe " + sum);
        }

        @Override
        public void run() {
            IntStream.iterate(1, value -> value + 1)
                    .limit(50)
                    .forEach(this::printReport);
                            // for (int i = 1; i <= 50; i++) {
                            //     this.printReport(i);
                            // }
        }
    }

    /**
     * @author Michael Hartwig
     * name: main
     *
     * Diese Klasse simuliert eine Bank, deren Kunden und Umbuchungen.
     * Es werden Threads verwendet.
     */
    public static void main(String[] args) {

        Thread customer1 = new Thread(new Customer());
        Thread customer2 = new Thread(new Customer());
        customer1.start();
        customer2.start();

        Thread bankingReport = new Thread(new BankingReport());
        bankingReport.start();


    }



}
