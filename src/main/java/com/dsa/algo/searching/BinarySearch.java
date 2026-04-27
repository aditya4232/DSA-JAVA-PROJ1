package com.dsa.algo.searching;

/**
 * Binary Search implementations
 * O(log n) time complexity
 */
public class BinarySearch {

    // Classic binary search - returns index or -1
    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Find first occurrence (lower bound)
    public static int findFirst(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Find last occurrence (upper bound)
    public static int findLast(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Search insert position (lower bound)
    public static int searchInsert(int[] arr, int target) {
        if (arr == null) return 0;
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    // Search in rotated sorted array
    public static int searchRotated(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            // Left half is sorted
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // Right half is sorted
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    // Find minimum in rotated sorted array
    public static int findMinRotated(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    // Binary search on answer space
    public static int binarySearchOnAnswer(int target) {
        int left = 0;
        int right = target;
        int answer = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            
            if (square == target) {
                return mid;
            } else if (square < target) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    // Sqrt(x) using binary search
    public static int sqrt(int x) {
        if (x < 2) return x;
        return binarySearchOnAnswer(x);
    }
}
