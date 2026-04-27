package com.dsa.system;

/**
 * Common Design Patterns for Interview Prep
 */
public class DesignPatterns {

    // ========== Singleton Pattern ==========
    public static class Singleton {
        private static volatile Singleton instance;

        private Singleton() { }

        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }

    // ========== Factory Pattern ==========
    public interface Shape {
        void draw();
    }

    public static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    public static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    public static class ShapeFactory {
        public Shape getShape(String type) {
            if ("CIRCLE".equalsIgnoreCase(type)) {
                return new Circle();
            } else if ("RECTANGLE".equalsIgnoreCase(type)) {
                return new Rectangle();
            }
            throw new IllegalArgumentException("Unknown shape: " + type);
        }
    }

    // ========== Observer Pattern ==========
    public interface Observer {
        void update(String message);
    }

    public static class ConcreteObserver implements Observer {
        private String name;

        public ConcreteObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(String message) {
            System.out.println(name + " received: " + message);
        }
    }

    public static class Subject {
        private List<Observer> observers = new ArrayList<>();

        public void addObserver(Observer o) {
            observers.add(o);
        }

        public void removeObserver(Observer o) {
            observers.remove(o);
        }

        public void notifyObservers(String message) {
            for (Observer o : observers) {
                o.update(message);
            }
        }
    }

    // ========== Strategy Pattern ==========
    public interface SortStrategy {
        void sort(int[] arr);
    }

    public static class QuickSortStrategy implements SortStrategy {
        @Override
        public void sort(int[] arr) {
            com.dsa.algo.sorting.QuickSort.sort(arr);
        }
    }

    public static class MergeSortStrategy implements SortStrategy {
        @Override
        public void sort(int[] arr) {
            com.dsa.algo.sorting.MergeSort.sort(arr);
        }
    }

    public static class Sorter {
        private SortStrategy strategy;

        public Sorter(SortStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(SortStrategy strategy) {
            this.strategy = strategy;
        }

        public void sort(int[] arr) {
            strategy.sort(arr);
        }
    }
}
