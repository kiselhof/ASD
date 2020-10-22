package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = 5000;
        int[] arr_ = new int[n];
        for (int i = 0; i < arr_.length; i++)
            arr_[i] = rd.nextInt();

               /*
               *
               * Bubble
               *
               * */

        bubbleSort BS = new bubbleSort();
        System.out.println("Bubble Sort");
        long time = System.currentTimeMillis();
        BS.bubbleSort(arr_);
        System.out.println("Время исполнения = " + (System.currentTimeMillis() - time) + " мс");

        int[] arr_2 = new int[n];
        for (int i = 0; i < arr_2.length; i++)
            arr_2[i] = rd.nextInt();

        int low = 0;
        int high = arr_2.length - 1;

        /*
         *
         * Quick
         *
         * */
        quicksort qs = new quicksort();
        System.out.println("Quick sort");
        time = System.currentTimeMillis();
        qs.quickSort(arr_2, low, high);
        System.out.println("Время исполнения = " + (System.currentTimeMillis() - time) + " мс");


        int[] arr_3 = new int[n];
        for (int i = 0; i < arr_3.length; i++)
            arr_3[i] = rd.nextInt();
        /*
         *
         * Insertion
         *
         * */
        insertionSort inSort = new insertionSort();
        System.out.println("Insertion Sort");
        time = System.currentTimeMillis();
        inSort.sort(arr_3);
        System.out.println("Время исполнения = " + (System.currentTimeMillis() - time) + " мс");


    }
}
