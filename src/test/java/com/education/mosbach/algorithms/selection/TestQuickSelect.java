package com.education.mosbach.algorithms.selection;

import com.education.mosbach.algorithms.sort.QuickSort;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestQuickSelect {

    private QuickSelect quickSelect;

    @Before
    public void before() {
        quickSelect = new QuickSelect();
    }

    @After
    public void after() { quickSelect = null; }

    @Test
    @Parameters({
            "1               ,   1              ,       1",
            "9-9             ,   2              ,       9",
            "1-2-3-4-5-6     ,   3              ,       3",
            "112-110-99      ,   3              ,       112",
            "9-88-5-887-45   ,   2              ,       9",
            "0-0-0-0         ,   1              ,       0"
    })
    public void testSort(String unsorted, int place, int result) {
        int[] unSortedArray =
                Arrays.stream(unsorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        ArrayList<Integer> unSortedArrayList = new ArrayList<>();
        for (int e : unSortedArray)
            unSortedArrayList.add(e);

        int found = quickSelect.select(unSortedArrayList, place);
        assertEquals(result, found);
    }



}
