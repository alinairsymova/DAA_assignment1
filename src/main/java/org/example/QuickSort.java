package org.example;

public class QuickSort implements Sorter {

    @Override
    public void sort(int[] array, Metrics metrics) {
        quickSort(array, 0, array.length - 1, metrics);
    }

    private void quickSort(int[] array, int low, int high, Metrics metrics) {
        if (low < high) {
            int pi = partition(array, low, high, metrics);
            quickSort(array, low, pi - 1, metrics);
            quickSort(array, pi + 1, high, metrics);
        }
    }

    private int partition(int[] array, int low, int high, Metrics metrics) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            metrics.incrementComparisons();
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j, metrics);
            }
        }
        swap(array, i + 1, high, metrics);
        return i + 1;
    }

    private void swap(int[] array, int i, int j, Metrics metrics) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        metrics.incrementSwaps();
    }
}
