package cn.fatedeity.algorithm.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        this.palindromeNumber = new PalindromeNumber();
    }

    @Test
    void answer() {
        assertTrue(this.palindromeNumber.answer(121), "题目示例 1");
        assertFalse(this.palindromeNumber.answer(-121), "题目示例 2");
        assertFalse(this.palindromeNumber.answer(10), "题目示例 3");
    }
}
