package cn.fatedeity.algorithm.sort;

/**
 * 希尔排序类
 */
public class ShellSort extends AbstractSort {
    @Override
    public int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        int length = numbers.length;
        // 通常增量序列进行二分对原序列拆分
        for (int gap = length >> 1; gap > 0; gap = gap >> 1) {
            for (int i = gap; i < length; i++) {
                int j = i, current = numbers[i];
                while (j >= gap && numbers[j - gap] > current) {
                    numbers[j] = numbers[j - gap];
                    j = j - gap;
                }
                numbers[j] = current;
            }
        }
        return numbers;
    }
}
