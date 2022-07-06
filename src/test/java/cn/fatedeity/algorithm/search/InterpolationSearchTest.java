package cn.fatedeity.algorithm.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpolationSearchTest {
    private InterpolationSearch interpolationSearch;

    @BeforeEach
    void setUp() {
        this.interpolationSearch = new InterpolationSearch();
    }

    @Test
    void search() {
        assertEquals(
                8,
                interpolationSearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 8),
                "有目标值的序列"
        );
        assertEquals(
                8,
                interpolationSearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 8),
                "无目标值的序列"
        );
        assertEquals(
                0,
                interpolationSearch.search(new int[]{0}, 0),
                "只有一个值的序列"
        );
        assertEquals(
                -1,
                interpolationSearch.search(new int[]{}, 0),
                "空序列"
        );
    }
}
