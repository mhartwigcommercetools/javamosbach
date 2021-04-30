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
            // System.out.println("Zahl " + i + " " + temp);
        };

        // 3 Threads berechnen die Summe
        // TODO 3 hardcodiert, durch Anzahl Variable ersetzen
        //
        long[] sums = new long[3];
        for (int i = 0; i < 3; i++)
            sums[i] = 0;
        long finalSum = 0;
        Thread[] counterThreads = new Thread[3];

        final long currentTimeMillisStartThreads = System.currentTimeMillis();
        for (int noOfThread = 0; noOfThread < 3; noOfThread++) {
            final int finalNoOfThread = noOfThread;
            Thread t = new Thread(() -> {
                for (int i = finalNoOfThread * (limit / 3); i < (finalNoOfThread + 1) * (limit / 3); i++)
                    sums[finalNoOfThread] += randomNumbers[i];
                if (finalNoOfThread == 2)
                    sums[finalNoOfThread] += randomNumbers[limit - 1];
                // System.out.println("sum " + sums[finalNoOfThread]);
                // finalSum += sums[finalNoOfThread]; gefaehrlich, siehe Unterricht morgen
            });
            counterThreads[finalNoOfThread] = t;
            t.start();
        }

        // Nicht empfohlen, aber geht. Wir warten auf die Threads.

        try {
            counterThreads[0].join();
            counterThreads[1].join();
            counterThreads[2].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long sumViaThreads = sums[0] + sums[1] + sums[2];
        final long currentTimeMillisEndThreads = System.currentTimeMillis();
        System.out.println("Summe via Threads " + sumViaThreads);
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
