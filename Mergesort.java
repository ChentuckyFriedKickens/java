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

    }
    list2d[0] = new int[] { list[0] };
    System.out.println(list2d[0][0]);
  }
}