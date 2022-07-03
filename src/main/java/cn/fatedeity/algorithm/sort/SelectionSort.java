package cn.fatedeity.algorithm.sort;

/**
 * 选择排序类
 */
public class SelectionSort extends AbstractSort {
    @Override
    public int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 选取到小的值做交换
                if (numbers[i] <= numbers[j]) {
                    continue;
                }
                this.swap(numbers, i, j);
            }
        }
        return numbers;
    }
}
