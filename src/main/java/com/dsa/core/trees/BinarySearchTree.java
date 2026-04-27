package com.dsa.core.trees;

import java.util.*;

/**
 * Binary Search Tree implementation with common operations
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;
    private int size;

    private class Node {
        T data;
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
        }
    }

    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, T data) {
        if (current == null) {
            size++;
            return new Node(data);
        }
        if (data.compareTo(current.data) < 0) {
            current.left = insertRecursive(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = insertRecursive(current.right, data);
        }
        return current;
    }

    public boolean contains(T data) {
        return containsRecursive(root, data);
    }

    private boolean containsRecursive(Node current, T data) {
        if (current == null) return false;
        if (data.equals(current.data)) return true;
        return data.compareTo(current.data) < 0 ?
                containsRecursive(current.left, data) :
                containsRecursive(current.right, data);
    }

    public void delete(T data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, T data) {
        if (current == null) return null;

        if (data.compareTo(current.data) < 0) {
            current.left = deleteRecursive(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = deleteRecursive(current.right, data);
        } else {
            size--;
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;
            T smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
        }
        return current;
    }

    private T findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    public List<T> inorderTraversal() {
        List<T> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private void inorderRecursive(Node node, List<T> result) {
        if (node != null) {
            inorderRecursive(node.left, result);
            result.add(node.data);
            inorderRecursive(node.right, result);
        }
    }

    public List<T> preorderTraversal() {
        List<T> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    private void preorderRecursive(Node node, List<T> result) {
        if (node != null) {
            result.add(node.data);
            preorderRecursive(node.left, result);
            preorderRecursive(node.right, result);
        }
    }

    public List<T> postorderTraversal() {
        List<T> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }

    private void postorderRecursive(Node node, List<T> result) {
        if (node != null) {
            postorderRecursive(node.left, result);
            postorderRecursive(node.right, result);
            result.add(node.data);
        }
    }

    public List<T> levelOrderTraversal() {
        List<T> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            result.add(node.data);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return result;
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node node) {
        if (node == null) return -1;
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }

    public T findMin() {
        if (root == null) throw new NoSuchElementException("Tree is empty");
        return findSmallestValue(root);
    }

    public T findMax() {
        if (root == null) throw new NoSuchElementException("Tree is empty");
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public String toString() {
        return "BST" + inorderTraversal().toString();
    }
}