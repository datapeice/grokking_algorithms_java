import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class BinarySearchTest {
    @Test
    void testBinarySearch(){
        List<Integer> data = List.of(3, 1, 2, 10, 12);
        int target = 10;
        int expected = 3;

        int result = BinarySearch.binarySearch(data, target);
        assertEquals(expected, result);
    }
}
