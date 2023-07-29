package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void name() {
        int[] input = { 64, 34, 25, 12, 22, 11, 90 };
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted_arr = bubbleSort.bubble_sort(input);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        for (int i=0; i< input.length; i++){
            assertEquals(expected[i], sorted_arr[i], "Error: found index " + i + " is not sorted");
        }
    }
}
