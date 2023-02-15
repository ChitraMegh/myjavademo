package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(calculateInterest("SBI", 1000));
    }

    public static double calculateInterest(String bankName, int amount){
        if (bankName.equals("SBI")) {
            return  7.0 * amount / 100;
        } else if (bankName.equals("ICICI")) {
            return 8.0 * amount / 100;
        }
        return 0;
    }
}n


