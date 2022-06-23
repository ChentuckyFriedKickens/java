import java.util.*;

class Mergesort {
  double list[] = { 123, 50, 213, 59, 21, 69, 5 };

  public static void main(String[] args) {
    Mergesort program = new Mergesort();

    program.Sort(program.list);
  }

  void Sort(double array[]) {
    if (list.length % 2 == 0) {
      System.out.println("list can be split in half");

    } else {
      System.out.println("list cannot be split in half");
    }
  }
}