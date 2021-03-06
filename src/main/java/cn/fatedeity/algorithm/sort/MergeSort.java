package cn.fatedeity.algorithm.sort;

/**
 * 归并排序类
 */
public class MergeSort extends AbstractSort {
    private void merge(int[] numbers, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] newNumbers = new int[high - low + 1];
        int k = 0;

        while (i <= mid && j <= high) {
            if (numbers[i] < numbers[j]) {
                newNumbers[k++] = numbers[i++];
            } else if (numbers[i] > numbers[j]) {
                newNumbers[k++] = numbers[j++];
            } else {
                newNumbers[k++] = numbers[i++];
                newNumbers[k++] = numbers[j++];
            }
        }
        while (i <= mid) {
            newNumbers[k++] = numbers[i++];
        }
        while (j <= high) {
            newNumbers[k++] = numbers[j++];
        }

        if (high + 1 - low >= 0) {
            System.arraycopy(newNumbers, 0, numbers, low, high + 1 - low);
        }
    }

    private int[] sort(int[] numbers, int low, int high) {
        if (low < high) {
            int mid = (low + high) >> 1;
            this.sort(numbers, low, mid);
            this.sort(numbers, mid + 1, high);
            this.merge(numbers, low, mid, high);
        }
        return numbers;
    }

    @Override
    public int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        return this.sort(numbers, 0, numbers.length - 1);
    }
}
