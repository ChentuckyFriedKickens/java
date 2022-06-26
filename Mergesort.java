import java.util.*;

class Mergesort {
  int[] list = { 3, 7, 8, 5, 4, 2, 6, 1 };
  int[][] list2d = new int[list.length][];

  public static void main(String[] args) {
    Mergesort program = new Mergesort();

    program.Sort();
  }

  void Sort() {
    for (int i = 0; i < list.length; i++) {
      list2d[i] = new int[] { list[0] };
    }
    for (int j = 0; j < list2d.length; j++) {
      System.out.print(list2d[j][0] + ", ");
    }
  }
}