package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;

public class InsertionSortImpl implements IntArraySorter {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public int[] sort(int[] unsorted) {

       int selectedElement = Integer.MAX_VALUE;
       int[] sorted = new int[unsorted.length];

       for (int j = 0; j <= (unsorted.length - 1); j++) {
           sorted[j] = unsorted[j];
           int i = j;
           while (i > 0 && sorted[i] < sorted[i - 1]) {
               swap(sorted, i, i - 1);
               i--;
           }
       }
       return
                sorted;
    }

}
