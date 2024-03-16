package org.classMath;

public class Excercise3 {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += Math.floor(Math.random() * 6);

        }
        System.out.println(notesAverage(total, 5));
    }

    public static double notesAverage(double total, int length){
        return (total / length);
    }
}
