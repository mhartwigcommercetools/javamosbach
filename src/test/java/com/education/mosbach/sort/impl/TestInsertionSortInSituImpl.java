package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntArraySorter;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestInsertionSortInSituImpl {

    // private BubbleSortImpl bubbleSort;    // against Implementation. WRONG
    private IntArraySorter insertionSort;    // against Interface. CORRECT

    @Before
    public void before() {
        insertionSort = new InsertionSortInSituImpl();
    }

    @After
    public void after() {
        insertionSort = null;
    }

    @Test
    @Parameters({
            "1                  ,   1",
            "3-4                ,   3-4",
            "4-3                ,   3-4",
            "7-7-7-7-7-7        ,   7-7-7-7-7-7",
            "7-7-7-7-4-7        ,   4-7-7-7-7-7",
            "7-9-14-4-4-8       ,   4-4-7-8-9-14",
            "21-20-19-18-17     ,   17-18-19-20-21"
    })
    public void testSort(String unSorted, String sorted) {

        int[] unSortedArray =
                Arrays.stream(unSorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] sortedArray =
                Arrays.stream(sorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        assertArrayEquals(
                sortedArray,
                insertionSort.sort(unSortedArray)
        );
    }

    @Test
    public void testSort_emptyList() {
        int[] emptyList = {};
        assertEquals(
                emptyList.length,
                insertionSort.sort(emptyList).length
        );
    }

}



