package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;

public class BubbleSortImprovedImpl implements IntArraySorter {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public int[] sort(int[] unsorted) {

        boolean hadToSwap = true;

        for (int j = 0; j < (unsorted.length -1) && (hadToSwap == true); j++) {
            hadToSwap = false;
            for (int i = 0; i < (unsorted.length - 1); i++)
                if (unsorted[i] > unsorted[i + 1]) {
                    swap(unsorted, i, i + 1);
                    hadToSwap = true;
                }
        }
        return
                unsorted;
    }

}
