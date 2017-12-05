package ru.levelup.tatiana_nesterova.qa.homework1.task3;
import java.util.Random;

public class InvertClass {
    private int arr[];

    public InvertClass(int[] arr) {
        // constructor
        this.arr = arr;
    }

    public InvertClass(int random_min, int random_max, int array_size) {
        // constructor for array with random numbers

        arr = new int[array_size];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i]  = random_min + (int) (Math.random() * random_max);

    }

    public void printArray() {
        // print current array method

        for (int i=0; i< arr.length; i++)
            System.out.println(Double.toString(arr[i]));
    }

    public int[] runInvert() {
        // invert array method

        int[] result_arr = new int[arr.length];
        double temp;

        int j = 0;
        for (int i = arr.length-1; i >= 0; i--)
        {
            result_arr[j]=arr[i];
            j++;
        }
        return result_arr;
    }

}
