package com.education.mosbach.algorithms.sort;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class InsertionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> unsorted) {

        ArrayList<Integer> sorted = new ArrayList<>();

        while (unsorted.size() > 0) {
            final Integer pickedElement = unsorted.remove(0);
            int positionInSorted = sorted.size() - 1;

            while (
                    (positionInSorted > -1)
                            &&
                    (sorted.get(positionInSorted) > pickedElement)
            )
                positionInSorted--;

            sorted.add(positionInSorted + 1, pickedElement);
        }
        return sorted;
    }

}
