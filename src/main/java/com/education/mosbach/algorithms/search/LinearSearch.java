package com.education.mosbach.algorithms.search;

public class LinearSearch {

    public boolean search(int[] unsorted, int element) {

        int i = 0;
        while (i < unsorted.length) {
            if (unsorted[i] == element) return true;
            i++;
        }

        return false;
    }


}
