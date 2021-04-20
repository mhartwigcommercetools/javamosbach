package com.education.mosbach.classes.classesEight;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class DummyBankTransactionsPlayAtomic {

    static AtomicInteger[] accounts = {
            new AtomicInteger(1000),
            new AtomicInteger(1000),
            new AtomicInteger(1000)
    };

    static class Customer implements Runnable {
        void transfer(int from, int to, int amount) {
            accounts[from].getAndAdd(-1 * amount);
            accounts[to].getAndAdd(amount);
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
                sum += accounts[i].get();
                System.out.println(accounts[i].get());
            }
            System.out.println("Summe " + sum);
        }

        @Override
        public void run() {
            IntStream.iterate(1, value -> value + 1)
                    .limit(200)
                    .forEach(this::printReport);
                            // for (int i = 1; i <= 50; i++) {
                            //     this.printReport(i);
                            // }
        }
    }


    public static void main(String[] args) {

        Thread customer1 = new Thread(new Customer());
        Thread customer2 = new Thread(new Customer());
        customer1.start();
        customer2.start();

        Thread bankingReport = new Thread(new BankingReport());
        bankingReport.start();
    }



}
