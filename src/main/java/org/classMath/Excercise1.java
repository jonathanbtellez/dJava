package org.classMath;

public class Excercise1 {
    public static void main(String[] args) {
        double powResult = pow(4,2);
        System.out.println(powResult);
    }

    public static double pow(int base, int exponent){
        return Math.pow(base, exponent);
    }
}
