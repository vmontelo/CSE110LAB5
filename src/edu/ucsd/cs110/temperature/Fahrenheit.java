package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Fahrenheit((getValue() - 32) * (5f/9f));
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit( getValue());
    }

    public String toString() {
        // TODO: Complete this method
        return getValue() + " F";
    }
}

