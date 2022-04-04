package com.education.mosbach.utils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ClassPrepTest {

    private ClassPrep classPrep;

    @Before
    public void before() {
        classPrep = new ClassPrep();
    }

    @After
    public void after() {
        classPrep = null;
    }

    @Test
    @Parameters({
            "5                  ,   7                       ,   12",
            "0                  ,   0                       ,   0",
            "1                  ,   1                       ,   2",
            "-3                 ,   3                       ,   0"
    })
    public void testAddNumbers(int arg1, int arg2, int result) {
        assertEquals(
                result,
                classPrep.addTwoNumbers(arg1, arg2)
        );
    }







}
