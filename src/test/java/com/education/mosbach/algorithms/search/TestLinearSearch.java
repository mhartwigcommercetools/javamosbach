package com.education.mosbach.algorithms.search;

import com.education.mosbach.algorithms.sort.BubbleSort;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class TestLinearSearch {

    private LinearSearch linearSearch;

    @Before
    public void before() {
        linearSearch = new LinearSearch();
    }

    @After
    public void after() {
        linearSearch = null;
    }

    @Test
    @Parameters({
            "18               ,   18         , true",
            "18               ,   88         , false",
            "9-9-9-9-9        ,   9          , true",
            "9-9-9-9-9        ,   908        , false",
            "1-2-3-4-5-6      ,   6          , true",
            "9-88-5-887-45    ,   9          , true",
            "9-88-5-887-45    ,   81         , false"
    })
    public void testSearch(String unsorted, int element, boolean found) {
        int[] unSortedArray =
                Arrays.stream(unsorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        boolean result = linearSearch.search(unSortedArray, element);
        assertEquals(found, result);
    }


}
