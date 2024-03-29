package com.plantformsoftware;

public class Main {

    public static void main(String[] args) {
        var result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = "+result);
        var previousResult = result;
        System.out.println("previousResult = "+previousResult);
        result = result - 1;
        System.out.println("3 - 1 = "+result);
        System.out.println("previousResult = "+previousResult);

        result = result * 10; // 2 * 10
        System.out.println("2 * 10 = "+ result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = "+result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = "+result);

        // result = result + 1;
        result++; // Increments + 1
        System.out.println("1 + 1 = "+result);

        result--; // decrements -1
        System.out.println("2 - 1 = "+result);

        result += 2;
        System.out.println("1 + 2 = "+result);

        result *= 10;
        System.out.println("3 * 10 = "+result);

        result /= previousResult;
        System.out.println("30 / previousResult = "+result);

        result -= 2;
        System.out.println("10 - 2 = "+result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score.");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        var newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
