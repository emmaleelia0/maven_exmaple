package org.example;

public class BubbleSort {
    int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    void swap(int[] arr, int index_x, int index_y) {
        int temp = arr[index_y];
        arr[index_y] = arr[index_x];
        arr[index_x] = temp;
    }
}
