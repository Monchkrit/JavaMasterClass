package com.plantformsoftware;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("The minimum float value is "+myMinFloatValue);
        System.out.println("The maximum float value is "+myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("The minimum double value is "+myMinDoubleValue);
        System.out.println("The maximum double value is "+myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("Integer value is = "+myIntValue);
        System.out.println("Float value is = "+myFloatValue);
        System.out.println("Double value is = "+myDoubleValue);
    }
}
