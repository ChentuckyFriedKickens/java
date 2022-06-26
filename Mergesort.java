import java.util.*;

class Mergesort {
  int[] list = { 3, 7, 8, 5, 4, 2, 6, 1 };
  int[][] list2d = new int[list.length][];

  public static void main(String[] args) {
    Mergesort program = new Mergesort();

    program.Set2D(program.list, program.list2d);
  }

  void Set2D(int[] list1D, int[][] list2D) {
    for (int i = 0; i < list1D.length; i++) {
      list2D[i] = new int[] { list1D[i] };
    }
    System.out.print("2D converted array: { ");
    for (int j = 0; j < list2D.length; j++) {
      System.out.print("{ " + list2D[j][0] + " }, ");
    }
    System.out.print("}");
  }
}