package com.education.mosbach.structures.storageImpl;

import com.education.mosbach.algorithms.structures.storage.Storage;
import com.education.mosbach.algorithms.structures.storageImpl.ArrayListQueueStorageImpl;
import com.education.mosbach.algorithms.structures.storageImpl.ArrayListStackStorageImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestArrayListQueueStorageImpl {

    private Storage queue;

    @Before
    public void before() {
        queue = new ArrayListQueueStorageImpl();
    }

    @After
    public void after() { queue = null; }

    @Test
    @Parameters({
            "1               ,   0      ,     1   ,  false",
            "1               ,   1      ,     1   ,  true",
            "1-2-3-4-5-6     ,   0      ,     1   ,  false",
            "1-2-3-4-5-6     ,   1      ,     1   ,  false"
    })
    public void testSort(String elements, int peek, int element, boolean isEmpty) {
        int[] unSortedArray =
                Arrays.stream(elements.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int i : unSortedArray) queue.push(i);

        Integer getElementFromStack = null;
        if (peek == 0) getElementFromStack = (Integer) queue.peek();
        if (peek == 1) getElementFromStack = (Integer) queue.pop();

        assertEquals(element, getElementFromStack.intValue());
        assertEquals(isEmpty, queue.isEmpty());
    }

    @Test
    public void testPushPopCombination() {
        queue.push(5);
        queue.pop();
        queue.push(6);
        queue.push(7);
        queue.pop();
        queue.peek();
        queue.pop();
        assertEquals(true, queue.isEmpty());
    }


}
