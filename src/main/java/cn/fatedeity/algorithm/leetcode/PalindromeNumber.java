package cn.fatedeity.algorithm.leetcode;

/**
 * 回文数
 */
public class PalindromeNumber {
    public boolean answer(int x) {
        if (x < 0) {
            return false;
        }
        // 将整数进行翻转
        int reverse = 0;
        int rest = x;
        while (rest >= 10) {
            reverse = reverse * 10 + rest % 10;
            rest = (int) (rest / 10.0);
        }
        return reverse * 10 + rest == x;
    }
}
