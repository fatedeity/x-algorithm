package cn.fatedeity.sort;

/**
 * 选择排序算法
 */
public class SelectionSort {
    private static void swap(int[] numbers, int src, int target) {
        int temp = numbers[src];
        numbers[src] = numbers[target];
        numbers[target] = temp;
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    continue;
                }
                swap(numbers, i, j);
            }
        }
        return numbers;
    }
}
