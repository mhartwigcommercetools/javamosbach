package com.education.mosbach._classes.specialClasses;

import java.util.Random;
import java.util.stream.IntStream;

public class DummyStringCompetition {

    public static void main(String[] args) {

        int limit = 500_000;
        Random random = new Random();
        /*
        int[] randomNumbers = new int[limit];
        for (int i = 0; i < randomNumbers.length; i++)
            randomNumbers[i] = random.nextInt(1000);
        */

        int[] randomNumbers = IntStream
                                .iterate(1, x -> x + 1)
                                .limit(limit)
                                .map(random::nextInt)
                                .toArray();

        String st = "";
        StringBuilder sb = new StringBuilder("");
        StringBuffer sf = new StringBuffer("");
        long before, after;

        before = System.currentTimeMillis();
        // for (int i = 0; i < randomNumbers.length; i++)
        //     st += randomNumbers[i];
        for (int i : randomNumbers)
            st += i;
        after = System.currentTimeMillis();
        System.out.println("Zeit für String " + (after-before));

        before = System.currentTimeMillis();
        for (int i : randomNumbers)
            sb.append(i);
        after = System.currentTimeMillis();
        System.out.println("Zeit für String " + (after-before));

        before = System.currentTimeMillis();
        for (int i : randomNumbers)
            sf.append(i);
        after = System.currentTimeMillis();
        System.out.println("Zeit für String " + (after-before));







    }


}
