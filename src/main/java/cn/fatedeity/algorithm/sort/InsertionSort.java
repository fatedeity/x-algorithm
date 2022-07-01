package cn.fatedeity.algorithm.sort;

/**
 * 插入排序类
 */
public class InsertionSort extends Sort {
    public int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                // 一直交换到顺序相反
                if (numbers[j - 1] <= numbers[j]) {
                    break;
                }
                this.swap(numbers, j, j - 1);
            }
        }
        return numbers;
    }
}
