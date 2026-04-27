package com.dsa.algo.sorting;

/**
 * QuickSort - O(n log n) average, O(n^2) worst case
 * In-place sorting algorithm using divide and conquer
 */
public class QuickSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortDescending(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSortDesc(arr, 0, arr.length - 1);
    }

    private static void quickSortDesc(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionDesc(arr, low, high);
            quickSortDesc(arr, low, pivotIndex - 1);
            quickSortDesc(arr, pivotIndex + 1, high);
        }
    }

    private static int partitionDesc(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}