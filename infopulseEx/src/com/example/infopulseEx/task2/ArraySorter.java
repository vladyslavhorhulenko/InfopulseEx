package com.example.infopulseEx.task2;

import java.util.Random;

public class ArraySorter {
    public static void Sort(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static boolean TestSortedArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }

        return true;
    }

    public static int[] RandomArrayCreator(int length){
        int[] array = new int[length];
        Random random = new Random();

        for(int i = 0; i < array.length - 1; i++){
            array[i] = random.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        int[] randomArray = RandomArrayCreator(20);

        Sort(randomArray);

        System.out.println(TestSortedArray(randomArray));
    }
}
