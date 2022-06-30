import java.util.*;

public class BinarySearch {
  int[] list = { 1, 2, 3, 4, 5, 6, 7, 8 };

  public static void main(String[] args) {
    BinarySearch program = new BinarySearch();

    program.Search(program.list, 7);
  }

  void Search(int[] arr, int item) {
    int start = 0;
    int end = arr.length - 1;
    boolean found = false;

    while ((start <= end) && (found == false)) {
      int mid = (start + end) / 2;

      if (arr[mid] == item) {
        found = true;
        System.out.println(arr[mid] + " is in index " + mid + " of the list");
      } else {
        if (arr[mid] > item) {
          end = mid - 1;
        } else if (arr[mid] < item) {
          start = mid + 1;
        }
      }
    }
  }
}
