# Sorting Algorithms Assignment

## Overview
This project implements and compares several classic sorting algorithms in Java.  
The goal is to analyze their performance in terms of **comparisons** and **swaps** using a custom `Metrics` class.

Implemented algorithms:
- Merge Sort
- Quick Sort
- Bubble Sort
- Selection Sort

Additional components:
- `Metrics` class — counts comparisons and swaps
- `Sorter` interface — defines a common `sort()` method
- Unit tests (JUnit 5)
- CLI (`Main.java`) — allows the user to enter an array and choose a sorting algorithm

## Project Structure

src/
└── main/java/
├── Metrics.java
├── Sorter.java
├── MergeSort.java
├── QuickSort.java
├── BubbleSort.java
├── SelectionSort.java
└── Main.java
└── test/java/
└── SortTest.java

Example:
Enter numbers separated by spaces: 5 3 8 4 2 7 1 6
Choose algorithm: 
1 - MergeSort
2 - QuickSort
3 - BubbleSort
4 - SelectionSort

Running Tests
Unit tests are written with JUnit 5.
The tests verify that each algorithm sorts correctly and measure the number of comparisons and swaps.

Example Metrics
For the input:
5 3 8 4 2 7 1 6
Possible output:

MergeSort -> Comparisons=12, Swaps=4
QuickSort -> Comparisons=14, Swaps=6
BubbleSort -> Comparisons=28, Swaps=12
SelectionSort -> Comparisons=28, Swaps=7

Algorithm Analysis

MergeSort
Time complexity: O(n log n)
Stable, efficient for large datasets

QuickSort
Time complexity: Average O(n log n), Worst-case O(n²)
Usually very fast in practice

BubbleSort
Time complexity: O(n²)
Very inefficient on large datasets

SelectionSort
Time complexity: O(n²)
Fewer swaps than BubbleSort, but still slow

Assignment Workflow & Commits
The project was developed incrementally following a commit-based workflow:

feat(metrics): Implemented Metrics class to track comparisons and swaps
feat(merge): Implemented MergeSort with metrics support
test(merge): Added JUnit tests for MergeSort
feat(quicksort): Implemented QuickSort with randomized pivot and recursion into smaller partition
refactor(util): Extracted partition, swap utilities
feat(bubble): Implemented BubbleSort with metrics
feat(selection): Implemented SelectionSort with metrics
test(all): Added unified JUnit tests for all algorithms
feat(cli): Implemented Main.java for user input and algorithm selection
bench: Measured comparisons and swaps for different algorithms
docs: Created README and analysis of algorithms
release: Final version

Conclusion
This assignment demonstrates the differences between sorting algorithms not only in terms of theoretical time complexity but also practical behavior measured by the number of comparisons and swaps.
