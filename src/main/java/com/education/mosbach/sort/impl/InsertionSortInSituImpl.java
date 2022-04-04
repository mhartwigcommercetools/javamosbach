package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;

public class InsertionSortInSituImpl implements IntArraySorter {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public int[] sort(int[] unsorted) {

       for (int j = 0; j <= (unsorted.length - 1); j++) {
           int i = j;
           while (i > 0 && unsorted[i] < unsorted[i - 1]) {
               swap(unsorted, i, i - 1);
               i--;
           }
       }
       return
                unsorted;
    }

}
