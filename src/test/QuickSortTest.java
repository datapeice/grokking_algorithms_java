import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    @Test
    void testSortCorrectly() {
        List<Integer> data = List.of(3, 1, 2);
        List<Integer> expected = List.of(1, 2, 3);

        List<Integer> result = QuickSort.quickSearch(data);

        assertEquals(expected, result);
    }
}