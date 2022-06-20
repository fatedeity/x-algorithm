package cn.fatedeity.algorithm.sort;

/**
 * 冒泡排序算法
 */
public class BubbleSort {
    private static void swap(int[] numbers, int src, int target) {
        int temp = numbers[src];
        numbers[src] = numbers[target];
        numbers[target] = temp;
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean doSwap = false;
            for (int j = 0; j + 1 < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    doSwap = true;
                }
            }
            // 优化基础冒泡排序的步骤
            if (!doSwap) {
                // 如果遍历整个序列无需交换，则表示整个序列已经完全有序
                return numbers;
            }
        }
        return numbers;
    }
}
