package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void name() {
        int[] input = { 6, 3, 7, 8, 9 };
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted_arr = bubbleSort.bubble_sort(input);
        int[] expected = {3, 6, 7, 8, 9};

        for (int i=0; i< input.length; i++){
            assertEquals(expected[i], sorted_arr[i], "Error: found index " + i + " is not sorted");
        }
    }
}
