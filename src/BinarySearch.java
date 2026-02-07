import java.util.ArrayList;
import java.util.List;

class BinarySearch {
    public static void main(String[] args) {
        List<Integer> checkList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(binarySearch(checkList, 10));
    }

    public static Integer binarySearch (List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;
        int actions = 0;
        while (low <= high) {
            actions++;
            int mid = (low + high) / 2;
            int guess = list.get(mid);
            if (guess == target) {
                System.out.println("total actions: " + actions);
                return mid;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}