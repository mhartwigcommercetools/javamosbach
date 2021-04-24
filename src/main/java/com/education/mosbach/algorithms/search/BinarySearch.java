package com.education.mosbach.algorithms.search;

import java.math.BigInteger;

public class BinarySearch {

    public boolean search(int[] A, int start, int end, int e) {

        if (A.length == 0) return false;
        if (A.length == 1) return (A[0] == e);
        if (start > end) return false;
        if (start == end) return (A[start] == e);

        // Laut ungarischem Studenten buggy
        // wrong: int pivot = (start + end) / 2;
        // correct: int pivot = start + ((end - start) / 2);
        // oder über BigInteger
        BigInteger startBG = new BigInteger("" + start);
        BigInteger endBG = new BigInteger("" + end);
        int pivot = ((startBG.add(endBG)).divide(BigInteger.TWO)).intValue();

        if (e == A[pivot]) return true;
        if (e < A[pivot])
            return search(A, start, pivot-1, e);
        else
            return search(A, pivot+1, end, e);

    }

}
