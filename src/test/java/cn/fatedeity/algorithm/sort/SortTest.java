package cn.fatedeity.algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    private void testSort(Sort sortObj) {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                sortObj.sort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                "有序序列"
        );
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                sortObj.sort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}),
                "倒序序列"
        );
        assertArrayEquals(
                new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                sortObj.sort(new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                "有序坐标序列"
        );
        assertArrayEquals(
                new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                sortObj.sort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10}),
                "倒序坐标序列"
        );
        assertArrayEquals(
                new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                sortObj.sort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10}),
                "不包含零的坐标序列"
        );
        assertArrayEquals(
                new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10},
                sortObj.sort(new int[]{-5, 7, 4, -2, 6, 5, 8, 3, 2, -7, -1, 0, -3, 9, -6, -4, 10, 9, 1, -8, -9, -10}),
                "包含负数的随机序列"
        );
        assertArrayEquals(
                new int[]{1},
                sortObj.sort(new int[]{1}),
                "单元素序列"
        );
        assertArrayEquals(
                new int[]{},
                sortObj.sort(new int[]{}),
                "空序列"
        );
    }

    @Test
    void bubbleSort() {
        this.testSort(new BubbleSort());
    }

    @Test
    void selectionSort() {
        this.testSort(new SelectionSort());
    }

    @Test
    void insertionSort() {
        this.testSort(new InsertionSort());
    }

    @Test
    void shellSort() {
        this.testSort(new ShellSort());
    }

    @Test
    void quickSort() {
        this.testSort(new QuickSort());
    }

    @Test
    void mergeSort() {
        this.testSort(new MergeSort());
    }

    @Test
    void countSort() {
        this.testSort(new CountSort());
    }

    @Test
    void bucketSort() {
        this.testSort(new BucketSort());
    }

    @Test
    void radixSort() {
        this.testSort(new RadixSort());
    }
}
