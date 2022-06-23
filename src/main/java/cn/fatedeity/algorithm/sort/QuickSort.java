package cn.fatedeity.algorithm.sort;

import java.util.Random;

/**
 * 快速排序算法
 */
public class QuickSort {
    private static void swap(int[] numbers, int src, int target) {
        int temp = numbers[src];
        numbers[src] = numbers[target];
        numbers[target] = temp;
    }

    private static int[] sort(int[] numbers, int low, int high) {
        if (low > high) {
            return numbers;
        }
        // 随机数取基准值
        Random random = new Random();
        int pivotIndex = random.nextInt(low, high + 1);
        int pivot = numbers[pivotIndex];
        swap(numbers, pivotIndex, low);

        int mid = low + 1;
        for (int i = low + 1; i <= high; i++) {
            if (numbers[i] < pivot) {
                swap(numbers, i, mid);
                mid++;
            }
        }
        swap(numbers, low, --mid);
        sort(numbers, low, mid - 1);
        sort(numbers, mid + 1, high);
        return numbers;
    }

    public static int[] sort(int[] numbers) {
        return sort(numbers, 0, numbers.length - 1);
    }
}
