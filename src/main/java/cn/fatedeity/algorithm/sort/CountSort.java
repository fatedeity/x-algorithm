package cn.fatedeity.algorithm.sort;

/**
 * 计数排序算法
 */
public class CountSort {
    public static int[] sort(int[] numbers) {
        if (numbers.length == 0) {
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
