package com.education.mosbach.structures.storageImpl;

import com.education.mosbach.algorithms.structures.storage.Storage;
import com.education.mosbach.algorithms.structures.storageImpl.DynamicArrayStackStorageImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestDynamicArrayStackStorageImpl {

    private Storage stack;

    @Before
    public void before() {
        stack = new DynamicArrayStackStorageImpl();
    }

    @After
    public void after() { stack = null; }

    @Test
    @Parameters({
            "1               ,   0      ,     1   ,  false",
            "1               ,   1      ,     1   ,  true",
            "1-2-3-4-5-6     ,   0      ,     6   ,  false",
            "1-2-3-4-5-6     ,   1      ,     6   ,  false"
    })
    public void testSort(String elements, int peek, int element, boolean isEmpty) {
        int[] unSortedArray =
                Arrays.stream(elements.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int i : unSortedArray) stack.push(i);

        Integer getElementFromStack = null;
        if (peek == 0) getElementFromStack = (Integer) stack.peek();
        if (peek == 1) getElementFromStack = (Integer) stack.pop();

        assertEquals(element, getElementFromStack.intValue());
        assertEquals(isEmpty, stack.isEmpty());
    }

    @Test
    public void testPushPopCombination() {
        stack.push(5);
        stack.pop();
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.peek();
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }


}
