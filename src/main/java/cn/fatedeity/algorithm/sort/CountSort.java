package cn.fatedeity.algorithm.sort;

/**
 * 计数排序类
 */
public class CountSort extends AbstractSort {
    @Override
    public int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        int min = numbers[0], max = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }

        int[] count = new int[max - min + 1];
        for (int number : numbers) {
            int index = number - min;
            count[index]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                numbers[index++] = i + min;
                count[i]--;
            }
        }

        return numbers;
    }
}
