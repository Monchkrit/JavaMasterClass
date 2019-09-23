package com.plantformsoftware;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString+ ", and this is more text.");
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.49";
        System.out.println("The number as a string is "+numberString+", and this can not cast into a numerical value.");
        
    }
}
