package com.education.mosbach._classes.threads;

import java.util.Random;

public class DummyThreadArraySum {

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

        for (int noOfThread = 0; noOfThread < 3; noOfThread++) {
            int finalNoOfThread = noOfThread;
            new Thread(() -> {
                for (int i = finalNoOfThread * (limit / 3); i < (finalNoOfThread + 1) * (limit / 3); i++)
                    sums[finalNoOfThread] += randomNumbers[i];
                System.out.println("sum " + sums[finalNoOfThread]);
                // finalSum += sums[finalNoOfThread]; gefaehrlich, siehe Unterricht morgen
            }).start();
        }


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
