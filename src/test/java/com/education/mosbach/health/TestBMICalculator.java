package com.education.mosbach.health;

import com.education.mosbach.utils.ClassPrep;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBMICalculator {

    private BMICalculator bmiCalculator;

    @Before
    public void before() {
        bmiCalculator = new BMICalculator();
    }

    @After
    public void after() {
        bmiCalculator = null;
    }

    @Test
    @Parameters({
            "90                 ,   182                     ,   27",
            "140                ,   200                     ,   35",
            "70                 ,   193                     ,   18",
            "89                 ,   185                     ,   26"
    })
    public void testCalculateBMI(int weightInKG, int heightInCM, int bmi) {
        assertEquals(
                bmi,
                bmiCalculator.calculateBMI(weightInKG, heightInCM)
        );
    }

    @Test
    @Parameters({
            "90                 ,   182                     ,   Please do more sports.",
            "140                ,   200                     ,   Please do more sports.",
            "70                 ,   193                     ,   Your BMI is perfect.",
            "89                 ,   185                     ,   Please do more sports.",
            "56                 ,   180                     ,   Please eat more hamburgers.",
    })
    public void testCalculateBMIRecommendation(int weightInKG, int heightInCM, String bmiRecommendation) {
        assertEquals(
                bmiRecommendation,
                bmiCalculator.calculateBMIRecommendation(weightInKG, heightInCM)
        );
    }

}
