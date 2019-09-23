package com.plantformsoftware;

public class Main {
  public static void main(String[] args) {
    byte byteValue = 10;
    short shortValue = 250;
    int intValue = 19000;
    long longValue = (50000 + (10 * (byteValue + shortValue + intValue)));
    System.out.println("The calculation = "+longValue);
  }
}
