package cn.fatedeity.algorithm.sort;

/**
 * 排序抽象类
 */
public abstract class AbstractSort implements Sort {
    protected void swap(int[] numbers, int src, int target) {
        int temp = numbers[src];
        numbers[src] = numbers[target];
        numbers[target] = temp;
    }
}
