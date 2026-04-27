package com.dsa.interview;

import java.util.*;

/**
 * Company-specific interview preparation guide
 * Tracks progress for different company types
 */
public class CompanyPrep {

    public enum CompanyType {
        PRODUCT("Product Companies"),     // Flipkart, Amazon, Swiggy, Razorpay
        SERVICE("Service Companies"),     // TCS, Infosys, Wipro, Cognizant
        FINANCE("Finance Companies"),     // Goldman Sachs, JP Morgan, Morgan Stanley
        STARTUP("Startups"),              // Early-stage companies
        MAANG("MAANG");                   // Microsoft, Amazon, Apple, Netflix, Google

        private final String displayName;
        CompanyType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    private CompanyType companyType;
    private List<Problem> problems;
    private int completedProblems;
    private int totalProblems;

    public CompanyPrep(CompanyType type) {
        this.companyType = type;
        this.problems = new ArrayList<>();
        this.completedProblems = 0;
        initializeProblems();
    }

    private void initializeProblems() {
        switch (companyType) {
            case PRODUCT:
                initializeProductCompanyProblems();
                break;
            case SERVICE:
                initializeServiceCompanyProblems();
                break;
            case FINANCE:
                initializeFinanceCompanyProblems();
                break;
            case STARTUP:
                initializeStartupProblems();
                break;
            case MAANG:
                initializeMAANGProblems();
                break;
        }
        this.totalProblems = problems.size();
    }

    private void initializeProductCompanyProblems() {
        // String algorithms, Graph problems, System design focus
        problems.add(new Problem("Autocomplete System", "Trie, DFS", "Medium", 
            "Design autocomplete like Amazon search"));
        problems.add(new Problem("Product Recommendations", "Graph, BFS", "Medium",
            "Recommend products based on user behavior"));
        problems.add(new Problem("Rate Limiter", "Design, Queue", "Medium",
            "Implement rate limiting for API"));
        problems.add(new Problem("URL Shortener", "Design, Hash", "Medium",
            "Design TinyURL service"));
        problems.add(new Problem("Log Aggregator", "Design, Multithreading", "Hard",
            "Real-time log processing system"));
        problems.add(new Problem("String Pattern Matching", "KMP, Trie", "Medium",
            "Efficient pattern matching in large texts"));
        problems.add(new Problem("Social Network Graph", "Graph, BFS", "Medium",
            "Friend recommendation system"));
        problems.add(new Problem("Cache Implementation", "Design, LRU", "Medium",
            "Implement LRU cache for product catalog"));
    }

    private void initializeServiceCompanyProblems() {
        // Arrays, Strings, Basic algorithms, Clean code focus
        problems.add(new Problem("Array Rotation", "Array", "Easy",
            "Rotate array by k positions"));
        problems.add(new Problem("String Reversal", "String", "Easy",
            "Reverse words in sentence"));
        problems.add(new Problem("Palindrome Check", "String", "Easy",
            "Check if string is palindrome"));
        problems.add(new Problem("Matrix Operations", "Array", "Easy",
            "Basic matrix addition/multiplication"));
        problems.add(new Problem("Pattern Printing", "Loop", "Easy",
            "Print pyramid/diamond patterns"));
        problems.add(new Problem("Sorting Algorithms", "Sorting", "Medium",
            "Implement bubble, selection, insertion sort"));
        problems.add(new Problem("Binary Search Applications", "Searching", "Medium",
            "Various binary search problems"));
        problems.add(new Problem("Basic Recursion", "Recursion", "Easy",
            "Factorial, Fibonacci, GCD"));
    }

    private void initializeFinanceCompanyProblems() {
        // DP, Math, Greedy, Concurrency focus
        problems.add(new Problem("Stock Buy/Sell Max Profit", "DP, Greedy", "Medium",
            "Multiple transactions allowed"));
        problems.add(new Problem("Coin Change Problem", "DP", "Medium",
            "Minimum coins for amount"));
        problems.add(new Problem("Risk Calculation", "Math", "Hard",
            "Portfolio risk analysis"));
        problems.add(new Problem("Transaction Processing", "Concurrency", "Hard",
            "Thread-safe transaction system"));
        problems.add(new Problem("Interest Calculation", "Math", "Easy",
            "Compound interest computation"));
        problems.add(new Problem("Option Pricing", "Math", "Hard",
            "Black-Scholes model implementation"));
        problems.add(new Problem("Fraud Detection", "Array, Logic", "Medium",
            "Anomaly detection in transactions"));
        problems.add(new Problem("Ledger Balance", "Design", "Medium",
            "Double-entry bookkeeping system"));
    }

    private void initializeStartupProblems() {
        // General DSA, Problem-solving focus
        problems.add(new Problem("Build System", "Graph, Topological", "Medium",
            "Dependency resolution"));
        problems.add(new Problem("Task Scheduler", "Greedy, Heap", "Medium",
            "Schedule tasks with dependencies"));
        problems.add(new Problem("Load Balancer", "Design", "Hard",
            "Distribute requests evenly"));
        problems.add(new Problem("Feature Flag System", "Design", "Medium",
            "Enable/disable features dynamically"));
        problems.add(new Problem("Analytics Dashboard", "Design", "Medium",
            "Real-time metrics computation"));
    }

    private void initializeMAANGProblems() {
        // All categories, highest difficulty
        problems.add(new Problem("System Design: Messenger", "Design", "Hard",
            "Design Facebook Messenger"));
        problems.add(new Problem("News Feed System", "Design, Graph", "Hard",
            "Design social media feed"));
        problems.add(new Problem("Autocomplete System", "Design, Trie", "Hard",
            "Google-style autocomplete"));
        problems.add(new Problem("Typeahead Suggestions", "Trie, Design", "Hard",
            "Real-time search suggestions"));
        problems.add(new Problem("Distributed Cache", "Design", "Hard",
            "Redis-like cache system"));
        problems.add(new Problem("YouTube System Design", "Design", "Hard",
            "Video streaming platform"));
        problems.add(new Problem("Global Load Balancer", "Design", "Hard",
            "DNS-based load balancing"));
        problems.add(new Problem("Database Sharding", "Design", "Hard",
            "Horizontal partitioning strategy"));
    }

    public void markProblemComplete(String problemName) {
        for (Problem p : problems) {
            if (p.name.equals(problemName)) {
                if (!p.completed) {
                    p.completed = true;
                    completedProblems++;
                }
                return;
            }
        }
    }

    public void markProblemIncomplete(String problemName) {
        for (Problem p : problems) {
            if (p.name.equals(problemName)) {
                if (p.completed) {
                    p.completed = false;
                    completedProblems--;
                }
                return;
            }
        }
    }

    public List<Problem> getCompletedProblems() {
        List<Problem> completed = new ArrayList<>();
        for (Problem p : problems) {
            if (p.completed) completed.add(p);
        }
        return completed;
    }

    public List<Problem> getIncompleteProblems() {
        List<Problem> incomplete = new ArrayList<>();
        for (Problem p : problems) {
            if (!p.completed) incomplete.add(p);
        }
        return incomplete;
    }

    public double getProgressPercentage() {
        if (totalProblems == 0) return 0;
        return (completedProblems * 100.0) / totalProblems;
    }

    public void printProgress() {
        System.out.println("\n=== " + companyType.getDisplayName() + " Progress ===");
        System.out.printf("Progress: %.1f%% (%d/%d)\n", 
            getProgressPercentage(), completedProblems, totalProblems);
        System.out.println("\nCompleted:");
        for (Problem p : getCompletedProblems()) {
            System.out.println("  ✅ " + p);
        }
        System.out.println("\nRemaining:");
        for (Problem p : getIncompleteProblems()) {
            System.out.println("  ⬜ " + p);
        }
    }

    public static class Problem {
        String name;
        String topics;
        String difficulty;
        String description;
        boolean completed;
        Date startedDate;
        Date completedDate;

        public Problem(String name, String topics, String difficulty, String description) {
            this.name = name;
            this.topics = topics;
            this.difficulty = difficulty;
            this.description = description;
            this.completed = false;
            this.startedDate = null;
            this.completedDate = null;
        }

        @Override
        public String toString() {
            return String.format("[%s] %s - %s (%s)", 
                difficulty, name, topics, description);
        }
    }

    public static void main(String[] args) {
        // Test the company prep tracker
        CompanyPrep productPrep = new CompanyPrep(CompanyType.PRODUCT);
        productPrep.printProgress();
        
        System.out.println("\n=== Service Company Prep ===");
        CompanyPrep servicePrep = new CompanyPrep(CompanyType.SERVICE);
        servicePrep.printProgress();
    }
}
