package cn.fatedeity.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 桶排序类
 */
public class BucketSort extends Sort {
    private void swap(List<Integer> numbers, int src, int target) {
        int temp = numbers.get(src);
        numbers.set(src, numbers.get(target));
        numbers.set(target, temp);
    }

    private void insertSort(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (numbers.get(j - 1) <= numbers.get(j)) {
                    break;
                }
                this.swap(numbers, j, j - 1);
            }
        }
    }

    public int[] sort(int[] numbers) {
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

        // 以 10 为步长
        int bucketNum = (max - min) / 10 + 1;
        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new ArrayList<>());
        }

        // 将元素分配到桶中
        for (int number : numbers) {
            int index = (number - min) / 10;
            List<Integer> bucket = bucketList.get(index);
            bucket.add(number);
        }

        int index = 0;
        for (int i = 0; i < bucketNum; i++) {
            List<Integer> bucket = bucketList.get(i);
            this.insertSort(bucket);
            for (int number : bucket) {
                numbers[index++] = number;
            }
        }
        return numbers;
    }
}
