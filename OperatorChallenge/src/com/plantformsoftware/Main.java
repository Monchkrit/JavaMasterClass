package com.plantformsoftware;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 20.00;
        var dv2 = 80;
        var calculatedValue = (doubleValue + dv2) * 100.00;
        var remVal = calculatedValue % 40.00;
        var remPresent = remVal == 0 ? false : true;

        System.out.println("The value of remPresent is "+remPresent);
        System.out.println("The value of the remainder is "+remVal);

        if (remPresent == true) {
            System.out.println("There is a remainder.");
        }
    }
}
