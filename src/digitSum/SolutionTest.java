package digitSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testElementPresentInMiddle() {
        int[] input = {1, 3, 5, 7, 9, 11, 13, 15};
        int element = 7;
        assertEquals(3, solution.binarySearch(input, element), "Element should be found at index 3");
    }

    @Test
    public void testElementFirstPosition() {
        int[] input = {1, 3, 5, 7, 9, 11, 13, 15};
        int element = 1;
        assertEquals(0, solution.binarySearch(input, element), "Element should be found at index 0");
    }

    @Test
    public void testElementLastPosition() {
        int[] input = {1, 3, 5, 7, 9, 11, 13, 15};
        int element = 15;
        assertEquals(7, solution.binarySearch(input, element), "Element should be found at index 7");
    }

    @Test
    public void testElementNotFound() {
        int[] input = {1, 3, 5, 7, 9, 11, 13, 15};
        int element = 8;
        assertEquals(-1, solution.binarySearch(input, element), "Element should not be found");
    }

    @Test
    public void testSingleElementPresent() {
        int[] input = {5};
        int element = 5;
        assertEquals(0, solution.binarySearch(input, element), "Element should be found at index 0");
    }

    @Test
    public void testSingleElementNotFound() {
        int[] input = {5};
        int element = 3;
        assertEquals(-1, solution.binarySearch(input, element), "Element should not be found");
    }

    @Test
    public void testLargeArrayElementInMiddle() {
        int[] input = new int[10000];
        for (int i = 0; i < input.length; i++) {
            input[i] = i * 2; 
        }
        int element = 5000;
        assertEquals(2500, solution.binarySearch(input, element), "Element should be found at index 2500");
    }

    @Test
    public void testLargeArrayElementNotFound() {
        int[] input = new int[10000];
        for (int i = 0; i < input.length; i++) {
            input[i] = i * 2;
        }
        int element = 9999;
        assertEquals(-1, solution.binarySearch(input, element), "Element should not be found");
    }

    @Test
    public void testArrayWithDuplicatesElementNotFound() {
        int[] input = {1, 1, 1, 1, 3, 3, 5, 5};
        int element = 2;
        assertEquals(-1, solution.binarySearch(input, element), "Element should not be found");
    }

    @Test
    public void testArrayWithNegativeNumbersElementPresent() {
        int[] input = {-10, -5, 0, 5, 10};
        int element = 0;
        assertEquals(2, solution.binarySearch(input, element), "Element should be found at index 2");
    }

    @Test
    public void testArrayWithNegativeNumbersElementNotFound() {
        int[] input = {-10, -5, 0, 5, 10};
        int element = 7;
        assertEquals(-1, solution.binarySearch(input, element), "Element should not be found");
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int element = 5;
        assertEquals(-1, solution.binarySearch(input, element), "Element should not be found in an empty array");
    }
}
