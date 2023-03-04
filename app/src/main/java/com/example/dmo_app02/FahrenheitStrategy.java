package com.example.dmo_app02;

public class FahrenheitStrategy implements ConversorTemperatura{
    private static FahrenheitStrategy instance = null;

    private FahrenheitStrategy(){}

    public static FahrenheitStrategy getInstance(){
        if(instance == null){
            instance = new FahrenheitStrategy();
        }
        return instance;
    }

    @Override
    public double getConversion(double t){
        double F = 1.8 * t + 32;
        return F;
    }
}
