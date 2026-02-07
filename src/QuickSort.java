import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(10, 5, 3, 4, 9, 9, 9, 9));
        System.out.println(quickSearch(array));
    }

    public static List<Integer> quickSearch(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        }
        int pivotIndex = array.size() / 2;
        int pivot = array.get(pivotIndex);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for (Integer num : array) {
            if (num < pivot) {
                left.add(num);
            } else if (num >     pivot) {
                right.add(num);
            } else {
                equal.add(num);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(quickSearch(left));
        result.addAll(equal);
        result.addAll(quickSearch(right));
        return result;
    }
}
