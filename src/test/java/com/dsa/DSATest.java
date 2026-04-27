package com.dsa;

import com.dsa.core.arrays.DynamicArray;
import com.dsa.core.linkedlist.SinglyLinkedList;
import com.dsa.core.stacks.ArrayStack;
import com.dsa.core.queues.ArrayQueue;
import com.dsa.core.trees.BinarySearchTree;
import com.dsa.algo.sorting.QuickSort;
import com.dsa.algo.sorting.MergeSort;
import com.dsa.utils.DSAHelper;

import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * Comprehensive DSA unit tests
 */
public class DSATest {

    // ========== Array Tests ==========
    @Test
    @DisplayName("DynamicArray: Add and Get")
    void testDynamicArrayAddGet() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        assertThat(arr.get(0)).isEqualTo(10);
        assertThat(arr.get(1)).isEqualTo(20);
        assertThat(arr.get(2)).isEqualTo(30);
        assertThat(arr.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("DynamicArray: Insert at index")
    void testDynamicArrayInsert() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(10);
        arr.add(30);
        arr.add(1, 20);
        assertThat(arr.get(1)).isEqualTo(20);
        assertThat(arr.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("DynamicArray: Remove")
    void testDynamicArrayRemove() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        int removed = arr.remove(1);
        assertThat(removed).isEqualTo(20);
        assertThat(arr.size()).isEqualTo(2);
        assertThat(arr.get(1)).isEqualTo(30);
    }

    @Test
    @DisplayName("DynamicArray: Iterator")
    void testDynamicArrayIterator() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        int sum = 0;
        for (int val : arr) sum += val;
        assertThat(sum).isEqualTo(60);
    }

    // ========== LinkedList Tests ==========
    @Test
    @DisplayName("SinglyLinkedList: Add and Remove")
    void testLinkedListAddRemove() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        assertThat(list.size()).isEqualTo(3);
        assertThat(list.removeFirst()).isEqualTo(20);
        assertThat(list.removeLast()).isEqualTo(30);
        assertThat(list.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("SinglyLinkedList: Reverse")
    void testLinkedListReverse() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.reverse();
        assertThat(list.removeFirst()).isEqualTo(3);
        assertThat(list.removeFirst()).isEqualTo(2);
        assertThat(list.removeFirst()).isEqualTo(1);
    }

    @Test
    @DisplayName("SinglyLinkedList: Contains")
    void testLinkedListContains() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        assertThat(list.contains(10)).isTrue();
        assertThat(list.contains(30)).isFalse();
    }

    // ========== Stack Tests ==========
    @Test
    @DisplayName("ArrayStack: Push and Pop")
    void testStackPushPop() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertThat(stack.pop()).isEqualTo(30);
        assertThat(stack.pop()).isEqualTo(20);
        assertThat(stack.peek()).isEqualTo(10);
    }

    @Test
    @DisplayName("ArrayStack: Empty check")
    void testStackIsEmpty() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        assertThat(stack.isEmpty()).isTrue();
        stack.push(10);
        assertThat(stack.isEmpty()).isFalse();
        stack.pop();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("ArrayStack: Iterator (LIFO)")
    void testStackIterator() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int count = 0;
        for (int val : stack) {
            count++;
        }
        assertThat(count).isEqualTo(3);
    }

    // ========== Queue Tests ==========
    @Test
    @DisplayName("ArrayQueue: Enqueue and Dequeue")
    void testQueueEnqueueDequeue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertThat(queue.dequeue()).isEqualTo(10);
        assertThat(queue.dequeue()).isEqualTo(20);
        assertThat(queue.peek()).isEqualTo(30);
    }

    @Test
    @DisplayName("ArrayQueue: FIFO order")
    void testQueueFIFO() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 1; i <= 5; i++) queue.enqueue(i);
        for (int i = 1; i <= 5; i++) {
            assertThat(queue.dequeue()).isEqualTo(i);
        }
        assertThat(queue.isEmpty()).isTrue();
    }

    // ========== BST Tests ==========
    @Test
    @DisplayName("BinarySearchTree: Insert and Contains")
    void testBSTInsertContains() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        assertThat(bst.contains(30)).isTrue();
        assertThat(bst.contains(100)).isFalse();
    }

    @Test
    @DisplayName("BinarySearchTree: Traversals")
    void testBSTTraversals() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        assertThat(bst.inorderTraversal()).isEqualTo(List.of(20, 30, 40, 50, 70));
        assertThat(bst.preorderTraversal()).isEqualTo(List.of(50, 30, 20, 40, 70));
        assertThat(bst.postorderTraversal()).isEqualTo(List.of(20, 40, 30, 70, 50));
    }

    @Test
    @DisplayName("BinarySearchTree: Delete")
    void testBSTDelete() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.delete(30);
        assertThat(bst.contains(30)).isFalse();
        assertThat(bst.contains(20)).isTrue();
    }

    @Test
    @DisplayName("BinarySearchTree: Min and Max")
    void testBSTMinMax() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(80);
        assertThat(bst.findMin()).isEqualTo(20);
        assertThat(bst.findMax()).isEqualTo(80);
    }

    // ========== Sorting Tests ==========
    @Test
    @DisplayName("QuickSort: Sort ascending")
    void testQuickSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        QuickSort.sort(arr);
        assertThat(arr).isEqualTo(new int[]{11, 12, 22, 25, 34, 64, 90});
    }

    @Test
    @DisplayName("QuickSort: Sort descending")
    void testQuickSortDescending() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        QuickSort.sortDescending(arr);
        assertThat(arr).isEqualTo(new int[]{90, 64, 34, 25, 22, 12, 11});
    }

    @Test
    @DisplayName("QuickSort: Already sorted")
    void testQuickSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        QuickSort.sort(arr);
        assertThat(arr).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    @DisplayName("MergeSort: Sort long array")
    void testMergeSort() {
        int[] arr = {12, 11, 13, 5, 6, 7, 1, 9, 8, 15, 4};
        MergeSort.sort(arr);
        assertThat(arr).isEqualTo(new int[]{1, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15});
    }

    @Test
    @DisplayName("MergeSort: Stable sort")
    void testMergeSortLongArray() {
        int[] arr = DSAHelper.generateRandomArray(1000, 1, 1000);
        int[] copy = arr.clone();
        MergeSort.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            assertThat(arr[i - 1]).isLessThanOrEqualTo(arr[i]);
        }
    }

    // ========== Helper Tests ==========
    @Test
    @DisplayName("DSAHelper: Swap")
    void testHelperSwap() {
        int[] arr = {1, 2, 3};
        DSAHelper.swap(arr, 0, 2);
        assertThat(arr).isEqualTo(new int[]{3, 2, 1});
    }

    @Test
    @DisplayName("DSAHelper: Prime")
    void testHelperIsPrime() {
        assertThat(DSAHelper.isPrime(2)).isTrue();
        assertThat(DSAHelper.isPrime(17)).isTrue();
        assertThat(DSAHelper.isPrime(4)).isFalse();
        assertThat(DSAHelper.isPrime(1)).isFalse();
    }

    @Test
    @DisplayName("DSAHelper: Binary Search")
    void testHelperBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        assertThat(DSAHelper.binarySearch(arr, 5)).isEqualTo(2);
        assertThat(DSAHelper.binarySearch(arr, 6)).isEqualTo(-1);
    }

    @Test
    @DisplayName("DSAHelper: Palindrome")
    void testHelperPalindrome() {
        assertThat(DSAHelper.isPalindrome("racecar")).isTrue();
        assertThat(DSAHelper.isPalindrome("hello")).isFalse();
    }

    @Test
    @DisplayName("DSAHelper: Power of Two")
    void testHelperPowerOfTwo() {
        assertThat(DSAHelper.isPowerOfTwo(8)).isTrue();
        assertThat(DSAHelper.isPowerOfTwo(6)).isFalse();
        assertThat(DSAHelper.isPowerOfTwo(1)).isTrue();
    }
}
