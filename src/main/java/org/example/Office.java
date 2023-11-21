package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Office {
    private double squareMeters;

    private static final int RENT_SMALL_OFFICE = 2750;
    private static final int RENT_LARGE_OFFICE = 3200;

    private static final int TAX = 150;

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Office(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getMonthlyRent(){
        if (squareMeters > 20){
            var total = calculateMonthlyRent2785(squareMeters);
            return round(total / 12);
        } else {
            var total = calculateMonthlyRent3200(squareMeters);
            return round(total / 12);
        }
    }

    private double calculateMonthlyRent3200(double squareMeters) {
        return (squareMeters * RENT_LARGE_OFFICE) + (TAX * squareMeters) ;
    }

    private double calculateMonthlyRent2785(double squareMeters) {
        return (squareMeters) * (RENT_SMALL_OFFICE) + (TAX * squareMeters) ;
    }

    private double round(double value) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return "Office{" +
                "squareMeters=" + squareMeters +
                '}';
    }
}
