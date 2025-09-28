package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    void testCorrectness() {
        int[] a = {5, 2, 9, 1, 5, 6};
        int[] sorted = a.clone();
        Arrays.sort(sorted);

        Metrics m = new Metrics();
        new MergeSort().sort(a, m);

        assertArrayEquals(sorted, a);
        System.out.println("Comparisons: " + m.getComparisons() + ", Depth: " + m.getMaxDepth());
    }
}
