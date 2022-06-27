import java.util.*;

class Mergesort {
  int[] list = { 3, 7, 8, 5, 4, 2, 6, 1 };
  int[][] list2d = new int[list.length][];

  public static void main(String[] args) {
    Mergesort program = new Mergesort();

    program.Sort();
  }

  void Sort() {
    int[] list2 = new int[list.length / 2];
    System.out.println(list2.length);
  }

  void Set2D(int[] list1D, int[][] list2D) {
    for (int i = 0; i < list1D.length; i++) {
      list2D[i] = new int[] { list1D[i] };
    }
    System.out.print("2D converted array: { ");
    for (int j = 0; j < list2D.length; j++) {
      System.out.print("{ " + list2D[j][0] + " }, ");
    }
    System.out.println("}");
    list1D = list2D[0];

  }
}