package com.education.mosbach.algorithms.health;

public class BMICalculator {

    private double height_in_m = 1;
    private double weight_in_kg = 100;

    public BMICalculator(double height_in_m, double weight_in_kg) {
        setHeight_in_m(height_in_m);
        setWeight_in_kg(weight_in_kg);
    }

    public double getHeight_in_m() {
        return height_in_m;
    }

    public void setHeight_in_m(double height_in_m) {
        if ((height_in_m > 1) && (height_in_m < 2.52))
            this.height_in_m = height_in_m;
    }

    public double getWeight_in_kg() {
        return weight_in_kg;
    }

    public void setWeight_in_kg(double weight_in_kg) {
        if ((weight_in_kg > 20) && (weight_in_kg < 220))
            this.weight_in_kg = weight_in_kg;
    }

    public double calculateBMI() {

        System.out.println("Square the height " + (getHeight_in_m() * getHeight_in_m()));
        System.out.println("weight " + getWeight_in_kg());
        return
                getWeight_in_kg() / (getHeight_in_m() * getHeight_in_m());
    }


}
