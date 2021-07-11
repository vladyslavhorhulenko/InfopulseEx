package com.example.infopulseEx.task1;
import java.lang.Math;

public class task1 {
    private static final double c = -1.49;
    private static final double d = 23.4;

    public static double getHighElement(double[][] floats){
        double high = 0;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                floats[i-1][j-1] = Math.sqrt(Math.abs(Math.sin(Math.sin(c)) - ((4 * Math.log(Math.log(d))) / Math.pow(i, j))));
                if (floats[i - 1][j - 1] > high) {
                    high = floats[i - 1][j - 1];
                }
            }
        }
        return high;
    }

    public static void main(String[] args) {
        double[][] floats = new double[10][10];
        System.out.println(getHighElement(floats));
    }
}
