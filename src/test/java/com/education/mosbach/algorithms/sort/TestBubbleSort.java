package com.education.mosbach.algorithms.sort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class TestBubbleSort {

    private BubbleSort bubbleSort;

    @Before
    public void before() {
        bubbleSort = new BubbleSort();
    }

    @After
    public void after() {
        bubbleSort = null;
    }

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
        bubbleSort.sort(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }

    @Test
    @Parameters({
            "1               ,   1",
            "9-9             ,   9-9",
            "1-2-3-4-5-6     ,   1-2-3-4-5-6",
            "112-110-99      ,   99-110-112",
            "9-88-5-887-45   ,   5-9-45-88-887",
            "0-0-0-0         ,   0-0-0-0",
    })
    public void testSortImproved(String unsorted, String sorted) {
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
        bubbleSort.sortImproved(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }

}
