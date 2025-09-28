package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {

    private void runTest(Sorter sorter) {
        int[] unsorted = {5, 3, 8, 4, 2, 7, 1, 6};
        int[] expected = Arrays.copyOf(unsorted, unsorted.length);
        Arrays.sort(expected);

        Metrics metrics = new Metrics();
        sorter.sort(unsorted, metrics);

        assertArrayEquals(expected, unsorted, sorter.getClass().getSimpleName() + " failed");
        System.out.println(sorter.getClass().getSimpleName() + " -> " + metrics);
    }

    @Test
    void testMergeSort() {
        runTest(new MergeSort());
    }

    @Test
    void testQuickSort() {
        runTest(new QuickSort());
    }

    @Test
    void testBubbleSort() {
        runTest(new BubbleSort());
    }

    @Test
    void testSelectionSort() {
        runTest(new SelectionSort());
    }
}
