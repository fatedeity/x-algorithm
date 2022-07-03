package cn.fatedeity.algorithm.sort;

/**
 * 冒泡排序类
 */
public class BubbleSort extends AbstractSort {
    @Override
    public int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            boolean doSwap = false;
            for (int j = 0; j + 1 < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    this.swap(numbers, j, j + 1);
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
