import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {
    @Test
    void testSortCorrectly() {
        List<Integer> data = new ArrayList<>(List.of(3, 1, 2));
        List<Integer> expected = List.of(1, 2, 3);

        List<Integer> result = SelectionSort.selectionSort(data);

        assertEquals(expected, result);
    }
}