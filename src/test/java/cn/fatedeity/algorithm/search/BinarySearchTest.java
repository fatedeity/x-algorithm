package cn.fatedeity.algorithm.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        this.binarySearch = new BinarySearch();
    }

    @Test
    void sortArray() {
        assertEquals(
                8,
                binarySearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 8)
        );
    }

    @Test
    void notFound() {
        assertEquals(
                -1,
                binarySearch.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 10)
        );
    }

    @Test
    void oneElementArray() {
        assertEquals(
                0,
                binarySearch.search(new int[]{0}, 0)
        );
    }

    @Test
    void blankArray() {
        assertEquals(
                -1,
                binarySearch.search(new int[]{}, 0)
        );
    }
}
