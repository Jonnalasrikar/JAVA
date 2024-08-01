class PracticeSetOnInheritance {
  public static void main(String args[]) {

    Cylinder c = new Cylinder(5, 6);
    // Circle c1 = new Circle(5);
    System.out.println(c.area());
  }
}

class Circle {
  public int radius;
//default it executes use super keyword to execute your required constructor
  Circle() {
    System.out.println("iam a non parametrized constrictor");
  }

  Circle(int r) {
    System.out.println("iam parametrized constructor");
    this.radius = r;
  }

  public double area() {
    return 3.14 * radius * radius;
  }
}

class Cylinder extends Circle {
  public int height;

  Cylinder(int r, int h) {
    super(r);
    System.out.println("iam a constructor in Cylinder class");
    this.height = h;

  }

  public double volume() {
    return 3.14 * radius * radius * height;
  }
}