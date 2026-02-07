import java.util.ArrayList;
import java.util.List;

public class RecursiveSum {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(1, 2, 3, 5, 10));
        System.out.println(arraySum(array));
    }

    public static int arraySum(List<Integer> array) {
        if (array.isEmpty()) {
            return 0;
        }
        int firstElement = array.removeFirst();
        return firstElement + arraySum(array);
    }
}
