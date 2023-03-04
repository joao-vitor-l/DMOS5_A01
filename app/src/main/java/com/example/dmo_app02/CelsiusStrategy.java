package com.example.dmo_app02;

public class CelsiusStrategy implements ConversorTemperatura{
    private static CelsiusStrategy instance = null;

    private CelsiusStrategy(){}

    public static CelsiusStrategy getInstance(){
        if(instance == null){
            instance = new CelsiusStrategy();
        }
        return instance;
    }

    @Override
    public double getConversion(double t){
        double C = (t - 32) /  1.8;
        return C;
    }
}
