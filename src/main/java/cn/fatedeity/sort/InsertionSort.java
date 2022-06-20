package cn.fatedeity.sort;

/**
 * 插入排序算法
 */
public class InsertionSort {
    private static void swap(int[] numbers, int src, int target) {
        int temp = numbers[src];
        numbers[src] = numbers[target];
        numbers[target] = temp;
    }

    public static int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j - 1] <= numbers[j]) {
                    break;
                }
                swap(numbers, j, j - 1);
            }
        }
        return numbers;
    }
}
