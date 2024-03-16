package org.classMath;

public class Excercise2 {
    public static void main(String[] args) {
        int[] bases = {2,8,9,27,28,55,124};

        for (int base: bases){
            System.out.println(sqrt(base));
        }
    }

    public static Double sqrt(int base){
        return Math.sqrt(base);
    }
}
