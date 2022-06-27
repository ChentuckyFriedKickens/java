import java.util.*;

public class BinarySearch {
  int[] list = { 1, 2, 3, 4, 5, 6, 7, 8 };

  public static void main(String[] args) {
    BinarySearch program = new BinarySearch();

    program.Search(program.list, 3);
  }

  void Search(int[] arr, int item) {
    boolean found = false;
    int i = 0;

    while (found != true & i <= arr.length) {
      i++;
      int mid = arr.length / 2 - 1;
      int median = arr[mid];

      System.out.println(median);

      if (median == item) {
        found = true;
        System.out.println("It has been found, the median is " + median + " and it is in the index: " + mid);
      }
    }
  }
}
