package com.education.mosbach.algorithms.selection;

import com.education.mosbach.algorithms.sort.BubbleSort;

public class SimpleSelect {

    public int select(int[] A, int place) {

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(A);
        return A[place - 1];

    }

}
