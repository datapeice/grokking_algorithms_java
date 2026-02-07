import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(1, 3, 2, 10, 5, 7, 8, 0));

        System.out.println(selectionSort(array));
    }


    public static List<Integer> selectionSort(List<Integer> array) {
        List<Integer> newArray= new ArrayList<>();
        while (!array.isEmpty()){
            int smallest = findSmallest(array);
            newArray.add(array.remove(smallest));
        }
        return newArray;
    }

    public static int findSmallest(List<Integer> array) {
        int smallestValue = array.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < smallestValue) {
                smallestValue = array.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
