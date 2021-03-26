package com.education.mosbach.algorithms.search;

public class BinarySearch {

    public boolean search(int[] A, int start, int end, int e) {

        if (A.length == 0) return false;
        if (A.length == 1) return (A[0] == e);
        if (start > end) return false;
        if (start == end) return (A[start] == e);

        // Laut ungarischem Studenten buggy
        // int pivot = (start + end) / 2;
        int pivot = start + ((end - start) / 2);

        if (e == A[pivot]) return true;
        if (e < A[pivot])
            return search(A, start, pivot-1, e);
        else
            return search(A, pivot+1, end, e);

    }

}
