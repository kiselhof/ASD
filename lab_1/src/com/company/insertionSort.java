package com.company;

public class insertionSort {
    public void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

			/* Двигаем эллементы arr[0..i-1], которые
			больше чем следующий, на 1 позицию вперёд
			от текущей
			*/
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }

}
