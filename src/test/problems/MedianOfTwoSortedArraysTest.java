package test.problems;

import main.problems.MedianOfTwoSortedArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    void setMedianOfTwoSortedArrays() {
        assertEquals(2, medianOfTwoSortedArrays.medianOfTwoSortedArrays());
    }

}