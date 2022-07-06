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
    void sortArray() {
        assertEquals(
                8,
                interpolationSearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 8)
        );
    }

    @Test
    void notFound() {
        assertEquals(
                -1,
                interpolationSearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 10)
        );
    }

    @Test
    void oneElementArray() {
        assertEquals(
                0,
                interpolationSearch.search(new int[]{0}, 0)
        );
    }

    @Test
    void blankArray() {
        assertEquals(
                -1,
                interpolationSearch.search(new int[]{}, 0)
        );
    }
}
