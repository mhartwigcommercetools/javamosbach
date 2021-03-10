package com.education.mosbach.algorithms.health;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBMICalculator {

    private BMICalculator myBmiCalculator;

    @Before
    public void before() {
        myBmiCalculator = new BMICalculator(1.79, 70);
    }

    @After
    public void after() {
        myBmiCalculator = null;
    }

    @Test
    @Parameters({
            "2.0                ,   64.0                    ,   16.0",
            "2.0                ,   100.0                   ,   25.0"
    })
    public void testCalculateBMI(double arg1, double arg2, double result) {
        myBmiCalculator.setHeight_in_m(arg1);
        myBmiCalculator.setWeight_in_kg(arg2);
        assertEquals(result, myBmiCalculator.calculateBMI(), 0.01);
    }

    @Test
    @Parameters({
            "2.0                ,   64.0                    ,   McDonalds",
            "2.0                ,   120.0                   ,   sports"
    })
    public void testGetRecommendation(double arg1, double arg2, String result) {
        myBmiCalculator.setHeight_in_m(arg1);
        myBmiCalculator.setWeight_in_kg(arg2);
        String recommendation = myBmiCalculator.getRecommendation();
        Assert.assertTrue(
                recommendation.contains(result)
        );
    }

}
