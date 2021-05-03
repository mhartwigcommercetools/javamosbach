package com.education.mosbach._classes.threads;

import java.util.Random;

public class DummyThreadArraySumFinal {

    public static void main(String[] args) {

        int limit = 1_000_000_000;
        int[] randomNumbers = new int[limit];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            int temp = random.nextInt(100);
            randomNumbers[i] = temp;
        };

        // n Threads berechnen die Summe
        final int noOfThreads = 3;
        long[] sums = new long[noOfThreads];
        for (int i = 0; i < noOfThreads; i++)
            sums[i] = 0;
        long finalSum = 0;
        Thread[] counterThreads = new Thread[noOfThreads];

        final long currentTimeMillisStartThreads = System.currentTimeMillis();
        for (int j = 0; j < noOfThreads; j++) {
            final int finalNoOfThread = j;
            Thread t = new Thread(() -> {
                for (int i = finalNoOfThread * (limit / noOfThreads); i < (finalNoOfThread + 1) * (limit / noOfThreads); i++)
                    sums[finalNoOfThread] += randomNumbers[i];
                if (finalNoOfThread == noOfThreads - 1)
                    sums[finalNoOfThread] += randomNumbers[limit - 1];
            });
            counterThreads[finalNoOfThread] = t;
            t.start();
        }

        // Nicht empfohlen, siehe SEIV02, aber geht. Wir warten auf die Threads.
        try {
            for (int j = 0; j < noOfThreads; j++)
                counterThreads[j].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long sumViaThreads = 0;
        for (int j = 0; j < noOfThreads; j++)
            sumViaThreads += sums[j];
        final long currentTimeMillisEndThreads = System.currentTimeMillis();
        System.out.println("Summe fuer " + noOfThreads + " Threads " + sumViaThreads);
        System.out.println("Zeitverbrauch " + (currentTimeMillisEndThreads - currentTimeMillisStartThreads));


        // Vergleiche mit einem Hauptprogramm
        final long currentTimeMillisStart = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sum += randomNumbers[i];
        };
        final long currentTimeMillisEnd = System.currentTimeMillis();
        System.out.println("Die Summe der Zahlen im Array ist " + sum);
        System.out.println("Zeitverbrauch " + (currentTimeMillisEnd - currentTimeMillisStart));

    }

}
