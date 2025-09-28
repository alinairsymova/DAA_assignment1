package org.example;

public class MergeSort implements Sorter {
    private static final int CUTOFF = 16;

    @Override
    public void sort(int[] a, Metrics m) {
        m.start();
        int[] buffer = new int[a.length];
        mergesort(a, buffer, 0, a.length - 1, m);
        m.stop();
    }

    private void mergesort(int[] a, int[] buf, int left, int right, Metrics m) {
        if (right - left < CUTOFF) {
            insertionSort(a, left, right, m);
            return;
        }
        m.enterRecursion();
        int mid = (left + right) >>> 1;
        mergesort(a, buf, left, mid, m);
        mergesort(a, buf, mid + 1, right, m);
        merge(a, buf, left, mid, right, m);
        m.exitRecursion();
    }

    private void insertionSort(int[] a, int l, int r, Metrics m) {
        for (int i = l + 1; i <= r; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= l && a[j] > key) {
                m.compare();
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    private void merge(int[] a, int[] buf, int l, int mIdx, int r, Metrics m) {
        System.arraycopy(a, l, buf, l, r - l + 1);
        m.allocate();
        int i = l, j = mIdx + 1, k = l;
        while (i <= mIdx && j <= r) {
            m.compare();
            if (buf[i] <= buf[j]) a[k++] = buf[i++];
            else a[k++] = buf[j++];
        }
        while (i <= mIdx) a[k++] = buf[i++];
        while (j <= r) a[k++] = buf[j++];
    }
}
