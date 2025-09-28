package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Введите элементы массива через пробел:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        // Алгоритмы сортировки
        Sorter[] sorters = {
                new MergeSort(),
                new QuickSort(),
                new BubbleSort(),
                new SelectionSort()
        };

        for (Sorter sorter : sorters) {
            int[] copy = Arrays.copyOf(array, array.length);
            Metrics metrics = new Metrics();

            sorter.sort(copy, metrics);

            System.out.println(sorter.getClass().getSimpleName());
            System.out.println("Отсортированный массив: " + Arrays.toString(copy));
            System.out.println("Метрики: " + metrics);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
