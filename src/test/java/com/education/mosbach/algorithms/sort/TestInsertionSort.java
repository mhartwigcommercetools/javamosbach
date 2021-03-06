package com.education.mosbach.algorithms.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestInsertionSort {

    private InsertionSort insertionSort;

    @Before
    public void before() {
        insertionSort = new InsertionSort();
    }

    @After
    public void after() { insertionSort = null; }

    @Test
    @Parameters({
            "1               ,   1",
            "9-9             ,   9-9",
            "1-2-3-4-5-6     ,   1-2-3-4-5-6",
            "112-110-99      ,   99-110-112",
            "9-88-5-887-45   ,   5-9-45-88-887",
            "0-0-0-0         ,   0-0-0-0",
    })
    public void testSort(String unsorted, String sorted) {
        int[] unSortedArray =
                Arrays.stream(unsorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] sortedArray =
                Arrays.stream(sorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        ArrayList<Integer> unSortedArrayList = new ArrayList<>();
        for (int e : unSortedArray)
            unSortedArrayList.add(e);

        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        for (int e : sortedArray)
            sortedArrayList.add(e);

        assertEquals(sortedArrayList, insertionSort.sort(unSortedArrayList));
    }



}
