package com.education.mosbach.algorithms.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuickSort {

    public ArrayList<Integer> sort(ArrayList<Integer> unsorted) {

        if (unsorted.size() < 2) return unsorted;

        Integer pivot = unsorted.get(0);

        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        for (int i = 1; i < unsorted.size(); i++) {
            if (unsorted.get(i) <= pivot) smaller.add(unsorted.get(i));
            if (unsorted.get(i) > pivot) larger.add(unsorted.get(i));
        }

        ArrayList<Integer> smallerSorted = sort(smaller);
        ArrayList<Integer> largerSorted = sort(larger);

        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.addAll(smallerSorted);
        sorted.add(pivot);
        sorted.addAll(largerSorted);

        return sorted;
    }


}
