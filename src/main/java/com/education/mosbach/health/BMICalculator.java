package com.education.mosbach.health;

public class BMICalculator {

    public int calculateBMI(int weightInKG, int heightInCM) {
        return
                10_000 * weightInKG / (heightInCM * heightInCM);
    }

    public String calculateBMIRecommendation(int weightInKG, int heightInCM) {
        if (calculateBMI(weightInKG, heightInCM) < 18)
            return "Please eat more hamburgers.";
        if (calculateBMI(weightInKG, heightInCM) > 25)
            return "Please do more sports.";
        return
            "Your BMI is perfect.";
    }


}
