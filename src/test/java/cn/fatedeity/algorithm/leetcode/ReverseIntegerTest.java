package cn.fatedeity.algorithm.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private ReverseInteger reverseInteger;

    @BeforeEach
    void setUp() {
        this.reverseInteger = new ReverseInteger();
    }

    @Test
    void answer() {
        assertEquals(
                321,
                this.reverseInteger.answer(123),
                "题目示例 1"
        );
        assertEquals(
                -321,
                this.reverseInteger.answer(-123),
                "题目示例 2"
        );
        assertEquals(
                21,
                this.reverseInteger.answer(120),
                "题目示例 3"
        );
        assertEquals(
                0,
                this.reverseInteger.answer(0),
                "题目示例 4"
        );
        assertEquals(
                2147483641,
                this.reverseInteger.answer(1463847412),
                "错误解答 1"
        );
    }
}
