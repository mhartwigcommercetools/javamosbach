package com.education.mosbach.algorithms.sort;

public class SelectionSort {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public void sort(int[] A) {

        for (int actPos = 0; actPos < (A.length-1); actPos++) {
            int minPos = actPos;
            for (int i = actPos + 1; i < A.length; i++ )
                if (A[i] < A[minPos]) minPos = i;
            swap(A, actPos, minPos);
        }

    }

}
