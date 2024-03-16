package org.classMath;

public class Excercise4 {
    public static void main(String[] args) {
        System.out.println(greaterNumber(Math.round(Math.random() * 50),Math.round(Math.random() * 50)));
    }
    public static double greaterNumber(double number1, double number2) {
        return Math.max(number1, number2);
    }
}
