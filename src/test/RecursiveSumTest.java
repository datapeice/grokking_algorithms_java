import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveSumTest {
    @Test
    void testRecursiveSum() {
        List<Integer> data = new ArrayList<>(List.of(1, 2, 4));
        int expected = 7;

        int result = RecursiveSum.arraySum(data);

        assertEquals(expected, result);
    }
}