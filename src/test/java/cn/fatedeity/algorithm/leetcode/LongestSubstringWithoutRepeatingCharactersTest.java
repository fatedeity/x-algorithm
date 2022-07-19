package cn.fatedeity.algorithm.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void setUp() {
        this.longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void answer() {
        assertEquals(
                3,
                this.longestSubstringWithoutRepeatingCharacters.answer("abcabcbb"),
                "题目示例 1"
        );
        assertEquals(
                1,
                this.longestSubstringWithoutRepeatingCharacters.answer("bbbbb"),
                "题目示例 2"
        );
        assertEquals(
                3,
                this.longestSubstringWithoutRepeatingCharacters.answer("pwwkew"),
                "题目示例 3"
        );
    }
}
