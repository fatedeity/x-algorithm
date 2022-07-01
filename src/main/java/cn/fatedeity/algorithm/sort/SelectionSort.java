package cn.fatedeity.algorithm.sort;

/**
 * 选择排序类
 */
public class SelectionSort extends Sort {
    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    continue;
                }
                this.swap(numbers, i, j);
            }
        }
        return numbers;
    }
}
