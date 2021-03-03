package com.education.mosbach.utils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ClassPrepTest {

    @Test
    @Parameters({
            "5                  ,   7                       ,   12",
            "0                  ,   0                       ,   0",
            "1                  ,   1                       ,   2",
            "-3                 ,   3                       ,   0"
    })
    public void testAddNumbers(int arg1, int arg2, int result) {
        assertEquals(result, arg1+arg2);
    }







}
