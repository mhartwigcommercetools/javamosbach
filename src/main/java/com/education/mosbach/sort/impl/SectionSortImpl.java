package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;

public class SectionSortImpl implements IntArraySorter {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public int[] sort(int[] unsorted) {

        // int min = Integer.MAX_VALUE;   War mal die erste Idee
        int minPos = 0;

        for (int j = 0; j < (unsorted.length-1); j++) {
            minPos = j;
            for (int i = j + 1; i <= (unsorted.length - 1); i++)
                if (unsorted[i] < unsorted[minPos]) minPos = i;
            swap(unsorted, j, minPos);
        }
        return
                unsorted;
    }

}
