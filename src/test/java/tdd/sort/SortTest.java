package tdd.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void testInsertionSort() {
        // Arrange
        Insertion insertion = new Insertion();
        int[] input = {1,3,5,9,4,6,7,2,8};
        int[] expected = {1,2,3,4,5,6,7,8,9};
        // Act
        int[] actual = insertion.sort(input);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testInsertionSimple() {
        // Arrange
        Insertion insertion = new Insertion();
        int[] input = {3,2,1};
        int[] expected = {1,2,3};
        // Act
        int[] actual = insertion.sort(input);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testInsertionRightLength() {
        // Arrange
        Insertion insertion = new Insertion();
        int[] input = {3,2,1};
        // Act
        int[] actual = insertion.sort(input);
        // Assert
        assertEquals(actual.length, input.length);
    }
}
