package com.education.mosbach.algorithms.sort;

public class BubbleSort {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public void sort(int[] A) {
        for (int j = 0; j < A.length; j++)
            for (int i = 0; i < (A.length-1); i++)
                if (A[i] > A[i+1]) swap(A, i, i+1);
    }

    public void sortImproved(int[] A) {

        boolean hasSwapped = true;
        for (int j = 0; j < (A.length-1); j++) {
            if (hasSwapped) {
                hasSwapped = false;
                for (int i = 0; i < (A.length - 1 - j); i++)    // wir gehen nicht bis ans Ende
                    if (A[i] > A[i + 1]) {
                        swap(A, i, i + 1);
                        hasSwapped = true;
                    }
            }
        }
    }
}
