package com.education.mosbach.classes.classOne;

import com.education.mosbach.algorithms.health.BMICalculator;

public class DummyBmiCalculator {

    public static void main(String[] args) {
        BMICalculator myBmiCalculator = new BMICalculator(1.79, 70);
        System.out.println("My BMI Calculator:");
        System.out.println("==================================");
        System.out.println("Your height: " + myBmiCalculator.getHeight_in_m() + " cm");
        System.out.println("Your weight: " + myBmiCalculator.getWeight_in_kg() + " kg");
        System.out.println("Your bmi: " + myBmiCalculator.calculateBMI());

    }


}
