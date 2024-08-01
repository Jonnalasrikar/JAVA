class Practiceset3 {
  public static void main(String args[]) {
    // Square sc = new Square();
    // sc.side = 4;
    // sc.area();
    // sc.perimeter();
    rectangle rc = new rectangle();
    rc.length = 4;
    rc.breadth = 4;
    rc.area();
    rc.perimeter();
  }
}

// class Square {
// int side;

// public void area() {
// System.out.println(side * side);
// }

// public void perimeter() {
// System.out.println(4 * side);
// }
// }
class rectangle {
  int length;
  int breadth;

  public void area() {
    System.out.println(length * breadth);
  }

  public void perimeter() {
    System.out.println(2 * (length + breadth));
  }
}