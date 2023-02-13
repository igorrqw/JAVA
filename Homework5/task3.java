// Реализовать алгоритм пирамидальной сортировки (HeapSort).


package Homework5;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int arr[] = {4, 11, 12, 34, 5, 1, 9, 6,};

        sortArray(arr);
        System.out.print(Arrays.toString(arr));

    }
    private static void sortArray(int arr[]){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0 ; i--) {
            heapifyMetod(arr, n ,i);
        }
        for (int i = n - 1; i >=0 ; i--) {
            int buffer = arr[0];
            arr[0] = arr[i];
            arr[i] = buffer;
            heapifyMetod(arr, i ,0);
        }
    }
    private static void heapifyMetod(int[] arr, int size, int index){
        int max = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < size && arr[left] > arr[max])
            max = left;

        if(right < size && arr[right] > arr[max])
            max = right;

        if (max != index){
            int buffer = arr[index];
            arr[index] = arr[max];
            arr[max] = buffer;
            heapifyMetod(arr, size, max);
        }

    }
}