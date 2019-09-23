package com.plantformsoftware;

public class Main {

    public static void main(String[] args) {
        var pounds = 185;
        var kiloConvert = 0.45359237;
        var convertedToKilo = pounds * kiloConvert;
        System.out.println("The converted weight is "+convertedToKilo);
    }
}
