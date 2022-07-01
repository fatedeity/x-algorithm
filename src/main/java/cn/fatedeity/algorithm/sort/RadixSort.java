package cn.fatedeity.algorithm.sort;

import java.util.List;
import java.util.ArrayList;

/**
 * 计数排序类
 */
public class RadixSort extends Sort {
    public int[] sort(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }

        int min = numbers[0], max = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        int k = String.valueOf(Math.max(Math.abs(min), Math.abs(max))).length();

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            buckets.add(new ArrayList<>());
        }

        int x = 1;
        while (x <= k) {
            for (int number : numbers) {
                int index = (number / (int) Math.pow(10, x - 1)) % 10;
                List<Integer> bucket = buckets.get(index + 9);
                bucket.add(number);
            }

            int index = 0;
            for (int i = 0; i < buckets.size(); i++) {
                for (int number : buckets.get(i)) {
                    numbers[index++] = number;
                }
                buckets.set(i, new ArrayList<>());
            }

            x++;
        }

        return numbers;
    }
}
