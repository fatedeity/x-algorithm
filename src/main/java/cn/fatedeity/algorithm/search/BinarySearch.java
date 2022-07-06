package cn.fatedeity.algorithm.search;

/**
 * 二分查找类
 */
public class BinarySearch implements Search {
    private int search(int[] numbers, int target, int left, int right) {
        if (left > right) {
            return -1;
        } else if (left == right) {
            if (numbers[left] == target) {
                return left;
            } else {
                return -1;
            }
        }
        if (target < numbers[left] || target > numbers[right]) {
            return -1;
        }

        int mid = (left + right) >> 1;
        if (numbers[mid] > target) {
            return this.search(numbers, target, left, mid - 1);
        } else if (numbers[mid] < target) {
            return this.search(numbers, target, mid + 1, right);
        } else {
            return mid;
        }
    }

    @Override
    public int search(int[] numbers, int target) {
        return this.search(numbers, target, 0, numbers.length - 1);
    }
}
