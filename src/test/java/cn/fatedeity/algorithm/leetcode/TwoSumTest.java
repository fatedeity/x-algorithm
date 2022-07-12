package cn.fatedeity.algorithm.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        this.twoSum = new TwoSum();
    }

    @Test
    void answer() {
        assertArrayEquals(
                new int[]{0, 1},
                this.twoSum.answer(new int[]{2, 7, 11, 15}, 9),
                "题目示例 1"
        );
        assertArrayEquals(
                new int[]{1, 2},
                this.twoSum.answer(new int[]{3, 2, 4}, 6),
                "题目示例 2"
        );
        assertArrayEquals(
                new int[]{0, 1},
                this.twoSum.answer(new int[]{3, 3}, 6),
                "题目示例 2"
        );
    }
}
