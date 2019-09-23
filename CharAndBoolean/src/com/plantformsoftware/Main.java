package com.plantformsoftware;

public class Main {

    public static void main(String[] args) {
        var myvar = 'D';
        var myUnicodevar = '\u0044';
        System.out.println(myvar);
        System.out.println(myUnicodevar);
        var myCopyright = '\u00A9';
        System.out.println(myCopyright);

        var myTruevarValue = true;
        var myFalsevarValue = false;

        var isCustomerOverTwentyOne = true;
        System.out.println(myTruevarValue);
        System.out.println(myFalsevarValue);
        System.out.println(isCustomerOverTwentyOne);
    }
}
