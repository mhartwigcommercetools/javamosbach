package com.education.mosbach.classes.class01testing;

import com.education.mosbach.health.BMICalculator;

public class DummyBMICalculator {

    public static void main(String[] args) {
        BMICalculator myBMICalculator = new BMICalculator();
        System.out.println(
                "BMI of 90kg und 182cm = " +
                        myBMICalculator.calculateBMI(90, 182)
        );
        System.out.println(
                "BMI Recommendation of 90kg und 182cm = " +
                        myBMICalculator.calculateBMIRecommendation(90, 182)
        );
    }

}
