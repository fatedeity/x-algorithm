package cn.fatedeity.algorithm.sort;

import java.util.Random;

/**
 * 快速排序类
 */
public class QuickSort extends AbstractSort {
    private int[] sort(int[] numbers, int low, int high) {
        if (low > high) {
            return numbers;
        }
        // 随机数取基准值
        Random random = new Random();
        int pivotIndex = random.nextInt(low, high + 1);
        int pivot = numbers[pivotIndex];
        this.swap(numbers, pivotIndex, low);

        int mid = low + 1;
        for (int i = low + 1; i <= high; i++) {
            if (numbers[i] < pivot) {
                this.swap(numbers, i, mid);
                mid++;
            }
        }
        this.swap(numbers, low, --mid);
        // 递归实现
        this.sort(numbers, low, mid - 1);
        this.sort(numbers, mid + 1, high);
        return numbers;
    }

    @Override
    public int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        return this.sort(numbers, 0, numbers.length - 1);
    }
}
