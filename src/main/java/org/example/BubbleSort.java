package org.example;
public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] array, Metrics metrics) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                metrics.incrementComparisons();
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    metrics.incrementSwaps();
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
