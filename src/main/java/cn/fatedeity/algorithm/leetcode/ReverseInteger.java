package cn.fatedeity.algorithm.leetcode;

/**
 * 整数反转
 */
public class ReverseInteger {
    public int answer(int x) {
        int reverse = 0;
        while (x != 0) {
            // -2147483648 and 2147483647
            if (reverse < Integer.MIN_VALUE / 10 || reverse > Integer.MAX_VALUE / 10) {
                return 0;
            }
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse;
    }
}
