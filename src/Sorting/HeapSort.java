package Sorting;

import java.util.Arrays;

public class HeapSort {

    public void heapSort(int[] a) {
        int len = a.length;
        //build max heap
        for (int i = len / 2 - 1; i >= 0; i--) {
            buildMaxHeap(a, i, a.length);
        }

        //sorting order
        for (int i = len - 1; i >= 0; i--) {
            swap(a , 0,i);
            buildMaxHeap(a,0 , i);
        }
    }



    private void buildMaxHeap(int[] a, int i , int size) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if (left < size && a[left] > a[largest])
            largest = left;
        if (right < size && a[right] > a[largest])
            largest = right;
        if (largest != i) {
           swap(a, i ,largest);
            buildMaxHeap(a , largest , size);
        }
    }

    private void swap(int[] a, int i, int largest) {
        int temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;
    }

    public static void main(String[] args) {

        HeapSort heapSort  = new HeapSort();
        int [] arr = new int[]{5,13,2,25,7,17,20,8,4};
        heapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
