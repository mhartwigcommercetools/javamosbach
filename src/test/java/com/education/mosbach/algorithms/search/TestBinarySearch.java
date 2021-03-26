package com.education.mosbach.algorithms.search;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBinarySearch {

    private BinarySearch binarySearch;

    @Before
    public void before() {
        binarySearch = new BinarySearch();
    }

    @After
    public void after() {
        binarySearch = null;
    }

    @Test
    @Parameters({
            "18               ,   18         , true",
            "18               ,   88         , false",
            "9-9-9-9-9        ,   9          , true",
            "9-9-9-9-9        ,   908        , false",
            "1-2-3-4-5-6      ,   6          , true",
            "1-2-3-4-5-6      ,   5          , true",
            "1-2-3-4-5-6      ,   9          , false",
            "1-2-3-4-5-6      ,   1          , true"
    })
    public void testSearch(String unsorted, int element, boolean found) {
        int[] unSortedArray =
                Arrays.stream(unsorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        boolean result = binarySearch.search(unSortedArray, 0, unSortedArray.length-1, element);
        assertEquals(found, result);
    }

    @Test
    public void testSearch_EmptyList() {
        int[] unSortedArray = new int[0];
        boolean result = binarySearch.search(unSortedArray, 0, unSortedArray.length-1, 16);
        assertEquals(false, result);
    }

}
