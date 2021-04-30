package com.education.mosbach._classes.sortAndBMI;

import com.education.mosbach.algorithms.sort.*;

import java.util.ArrayList;
import java.util.Random;

public class SortingCompetition {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        Random random = new Random();
        long before, after;

        int limit1 = 1_000_000;
        int limit2 = 2_000_000;
        int[] unsorted1A = new int[limit1];
        int[] unsorted1B = new int[limit1];
        int[] unsorted2A = new int[limit2];
        int[] unsorted2B = new int[limit2];
        ArrayList<Integer> unsorted1 = new ArrayList<>();
        ArrayList<Integer> unsorted2 = new ArrayList<>();

        for (int i = 0; i < limit1; i++) {
            int t = random.nextInt();
            unsorted1A[i] = t;
            unsorted1B[i] = t;
            unsorted1.add(t);
        }
        for (int i = 0; i < limit2; i++) {
            int t = random.nextInt();
            unsorted2A[i] = t;
            unsorted2B[i] = t;
            unsorted2.add(t);
        }
/*
        before = System.currentTimeMillis();
        bubbleSort.sort(unsorted1A);
        after = System.currentTimeMillis();
        long bubbleSmall = after - before;

        before = System.currentTimeMillis();
        bubbleSort.sort(unsorted2A);
        after = System.currentTimeMillis();
        long bubbleLarge = after - before;

        System.out.println("BubbleSort brauchte  fuer " + limit1 + " " + bubbleSmall);
        System.out.println("BubbleSort brauchte  fuer " + limit2 + " " + bubbleLarge);
*/
        // BubbleSort brauchte  fuer 100000 22 767
        // BubbleSort brauchte  fuer 200000 63 987
        // QuickSort brauchte  fuer 100000 104
        // QuickSort brauchte  fuer 200000 166

        before = System.currentTimeMillis();
        quickSort.sort(unsorted1);
        after = System.currentTimeMillis();
        long quickSmall = after - before;

        before = System.currentTimeMillis();
        quickSort.sort(unsorted2);
        after = System.currentTimeMillis();
        long quickLarge = after - before;

        System.out.println("QuickSort brauchte  fuer " + limit1 + " " + quickSmall);
        System.out.println("QuickSort brauchte  fuer " + limit2 + " " + quickLarge);

    }

}
