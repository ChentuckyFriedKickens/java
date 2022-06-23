import java.util.*;

class bubblesort {
  int swaps = -1;
  int position;

  double x;
  double[] list = { 123, 50, 213, 59, 21, 69 };

  public static void main(String[] args) {
    bubblesort sort = new bubblesort();

    sort.Sort(sort.list);
  }

  void Sort(double[] array) {
    System.out.println("Starting algorithm");

    int p = 0;
    int totalSwaps = 0;

    while (swaps != 0) {
      swaps = 0;
      position = 0;
      p++;

      String current = "{  ";

      for (int i = 0; i < array.length; i++) {
        current += array[i];
        current += "  ";
      }
      current += "}";

      System.out.println("   Current list: " + current);

      System.out.println("Pass: " + p);

      while (position != array.length - 1) {
        System.out.println(" Position: " + position);

        if (array[position] > array[position + 1]) {
          x = array[position + 1];
          array[position + 1] = array[position];
          array[position] = x;
          System.out.print("      Swapped " + array[position] + " and " + array[position + 1]);
          swaps += 1;
          totalSwaps += 1;
          System.out.print("  Swap count: " + swaps);
          System.out.println();
        }
        position += 1;
      }

      System.out.println("Pass " + p + " finished.");
    }

    String str = "{  ";

    for (int i = 0; i < array.length; i++) {
      str += array[i];
      str += "  ";
    }
    str += "}";

    System.out.println();
    System.out.println("Finished algorithm");
    System.out.println("   Total passes made: " + p);
    System.out.println("   Total swaps made: " + totalSwaps);
    System.out.println("   Sorted list: " + str);
  }
}