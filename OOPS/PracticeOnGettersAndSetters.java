class PracticeOnGettersAndSetters {
  public static void main(String args[]) {
    // problem 1
    Cylinder cy = new Cylinder();
    cy.setRadius(9);
    cy.setHeight(13);
    cy.getRadius();
    cy.getHeight();
    System.out.println(cy.surfaceArea());
    System.out.println(cy.volume());
  }
}

class Cylinder {
  private int radius;
  private int height;

  public void setRadius(int radiuss) {
    radius = radiuss;
  }

  public void setHeight(int heightt) {
    height = heightt;
  }

  public void getRadius() {
    System.out.println(radius);
  }

  public void getHeight() {
    System.out.println(height);
  }

  public double surfaceArea() {
    return (2 * 3.14 * radius * radius + 2 * 3.14 * radius * height);
  }

  public double volume() {
    return (3.14 * radius * radius * height);
  }
}
