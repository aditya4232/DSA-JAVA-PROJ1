# 🚀 DSA Java Interview Prep 2026 - Crack Product & Software Companies

## 🎯 Goal
Master Data Structures & Algorithms in Java to crack **top Indian product companies (Flipkart, Amazon India, Swiggy, Zomato, Razorpay, Ola)** and **MNCs (Microsoft, Google, Goldman Sachs, JP Morgan)** interviews by 2026.

## 📊 Project Structure
```
dsa-java-interview-prep/
├── src/main/java/com/dsa/
│   ├── core/              # Core DSA Implementations
│   │   ├── arrays/        # DynamicArray, ArrayUtils
│   │   ├── strings/       # String algorithms
│   │   ├── linkedlist/    # Singly/Doubly Linked Lists
│   │   ├── stacks/        # Array/Linked Stack
│   │   ├── queues/        # Array/Linked Queue, PriorityQueue
│   │   ├── trees/         # BST, AVL, Trie
│   │   ├── graphs/        # Graph, GraphTraversal
│   │   ├── heaps/         # MinHeap, MaxHeap
│   │   └── tries/         # Trie implementations
│   │
│   ├── algo/              # Algorithm Implementations
│   │   ├── sorting/       # QuickSort, MergeSort, HeapSort
│   │   ├── searching/     # BinarySearch, TernarySearch
│   │   ├── dp/            # DP patterns
│   │   ├── greedy/        # Greedy algorithms
│   │   ├── backtracking/  # N-Queens, Sudoku
│   │   └── recursion/     # Recursion problems
│   │
│   ├── system/            # System Design Basics
│   ├── interview/         # Company-wise questions
│   └── utils/             # Helpers & validators
│
├── src/test/java/com/dsa/ # JUnit tests
├── docs/                  # Documentation & study plans
└── pom.xml                # Maven build
```

## 📈 Learning Path: Easy → Medium → Hard

### Phase 1: Foundations (Weeks 1-4) - EASY
**Target: Arrays, Strings, Basic Sorting**

#### Must-Solve Easy Problems (50+):
- **Arrays**: Two Sum, Best Time to Buy/Sell Stock, Contains Duplicate, Product of Array Except Self
- **Strings**: Valid Anagram, Valid Parentheses, Longest Common Prefix, Reverse String
- **Linked Lists**: Reverse Linked List, Merge Two Sorted Lists, Linked List Cycle
- **Binary Search**: Binary Search, Search Insert Position, First Bad Version
- **Sorting**: Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, QuickSort

#### Key Concepts:
- Time/Space Complexity Analysis (Big O)
- Two Pointers technique
- Sliding Window
- Basic Recursion

```java
// Example: Two Sum (Easy) - O(n) solution
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}
```

### Phase 2: Intermediate (Weeks 5-12) - MEDIUM
**Target: Trees, Graphs, DP, Backtracking**

#### Must-Solve Medium Problems (100+):
- **Trees**: Level Order Traversal, Validate BST, Lowest Common Ancestor
- **Graphs**: Number of Islands, Course Schedule, Clone Graph
- **Dynamic Programming**: Climbing Stairs, Coin Change, Longest Increasing Subsequence
- **Backtracking**: Subsets, Permutations, Combination Sum, N-Queens
- **Heaps**: Kth Largest Element, Merge K Sorted Lists

#### Key Patterns:
- BFS/DFS traversal
- Dynamic Programming (Memoization & Tabulation)
- Fast & Slow Pointers
- Binary Tree traversals (Inorder, Preorder, Postorder)

```java
// Example: Binary Tree Level Order - BFS
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();
            level.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        result.add(level);
    }
    return result;
}
```

### Phase 3: Advanced (Weeks 13-20) - HARD
**Target: Advanced DP, Graphs, System Design**

#### Must-Solve Hard Problems (30+):
- **DP**: Regular Expression Matching, Trapping Rain Water, Edit Distance
- **Graphs**: Dijkstra's Algorithm, Topological Sort, Minimum Spanning Tree
- **System Design**: Design TinyURL, LRU Cache, Rate Limiter

## 🎯 90-Day Study Plan for Indian Companies (2026)

### Month 1: Core DSA (Days 1-30)
- **Week 1**: Arrays & Strings - 15 problems
- **Week 2**: Linked Lists & Stacks/Queues - 15 problems  
- **Week 3**: Sorting & Searching - 10 problems
- **Week 4**: Recursion & Basic Backtracking - 10 problems

### Month 2: Trees & Graphs (Days 31-60)
- **Week 5**: Binary Trees & BST - 15 problems
- **Week 6**: Graph Traversal (BFS/DFS) - 15 problems
- **Week 7**: Dynamic Programming (1D/2D) - 15 problems
- **Week 8**: Advanced DP & Greedy - 15 problems

### Month 3: Mock Interviews & System Design (Days 61-90)
- **Week 9**: Heap, Trie, Advanced Topics - 15 problems
- **Week 10**: System Design Basics - Design Patterns, OOPs
- **Week 11**: Mock Interviews (3-4 per week)
- **Week 12**: Company-specific prep & Weak areas revision

## 🏢 Company-Specific Prep

### Product Companies (Flipkart, Amazon, Swiggy)
- Focus: Scalability, System Design, Optimization
- Key Areas: 
  - String processing (search, autocomplete)
  - Graph algorithms (recommendations, routes)
  - System Design (microservices, caching)
  - Real-time data processing

### Service Companies (TCS, Infosys, Wipro)
- Focus: Clean code, Problem-solving, Basics
- Key Areas:
  - Arrays & Strings manipulation
  - Pattern printing
  - Basic recursion
  - Database queries (SQL)

### Finance (Goldman Sachs, JP Morgan)
- Focus: Data integrity, Concurrency, Math
- Key Areas:
  - Dynamic Programming
  - Greedy algorithms
  - Bit manipulation
  - Concurrency basics

## 🛠️ Daily Practice Routine (2-3 hours/day)

1. **Warm-up (15 min)**: Review yesterday's problems
2. **New Problem (45 min)**: Solve one new problem (timed)
3. **Study Solution (30 min)**: Compare with optimal solution
4. **Implement (45 min)**: Code in Java with proper structure
5. **Write Tests (15 min)**: JUnit tests for edge cases

## 📚 Resources

### Books
- "Cracking the Coding Interview" - Gayle Laakmann McDowell
- "Elements of Programming Interviews" - Adnan Aziz
- "Introduction to Algorithms" - CLRS

### Online
- LeetCode (start Easy → Medium)
- HackerRank
- GeeksforGeeks
- InterviewBit

### Must-Know Java APIs
- `java.util.*` (Collections, Map, Set, List)
- `java.util.concurrent` (Threads, ExecutorService)
- `java.time` (Date/Time handling)
- `java.nio.file` (File operations)

## ✅ Interview Checklist

### Technical Skills
- [ ] Arrays & Strings manipulation
- [ ] Linked Lists (singly/doubly)
- [ ] Stacks & Queues (implementations)
- [ ] Binary Trees & BST operations
- [ ] Graph traversal (BFS/DFS)
- [ ] Sorting (Quick, Merge, Heap)
- [ ] Searching (Binary, Ternary)
- [ ] Dynamic Programming (1D/2D)
- [ ] Recursion & Backtracking
- [ ] Greedy algorithms
- [ ] Bit manipulation
- [ ] Time/Space complexity analysis

### System Design Basics
- [ ] OOPs principles (SOLID)
- [ ] Design patterns (Singleton, Factory, Observer)
- [ ] Database design (Normalization)
- [ ] API design (REST principles)
- [ ] Caching strategies
- [ ] Load balancing basics

### Behavioral
- [ ] STAR method for stories
- [ ] Leadership examples
- [ ] Conflict resolution
- [ ] Project explanations
- [ ] Why this company?

## 📝 How to Use This Repository

1. **Start with Easy problems** in `/interview/easy/`
2. **Implement solutions** in Java with proper structure
3. **Run tests** using `mvn test`
4. **Progress to Medium** after mastering Easy (80% success rate)
5. **Review solutions** in `/docs/solutions/`
6. **Track progress** in `/docs/progress.md`

## 🎯 Success Metrics

- Week 1-4: 50+ Easy problems solved
- Week 5-8: 50+ Medium problems solved
- Week 9-12: 30+ Medium/Hard problems solved
- Mock interviews: 10+ completed
- Success rate: 70%+ on first attempt

## 💡 Tips for Success

1. **Understand, don't memorize**: Focus on patterns, not individual problems
2. **Write clean code**: Proper naming, comments, structure
3. **Test thoroughly**: Edge cases, null checks, empty inputs
4. **Time yourself**: Practice under interview conditions
5. **Explain out loud**: Communicate your thinking process
6. **Learn from failures**: Review wrong answers thoroughly
7. **Consistency > Intensity**: Daily practice beats cramming

## 🔄 Progress Tracking

Update `/docs/progress.md` daily with:
- Problems solved
- Time taken
- Difficulty rating
- Key learnings

---

**Remember**: Quality > Quantity. Master 150 problems deeply rather than skimming 500. Good luck! 🍀