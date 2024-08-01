class PracticeSetOnAbstarctClassessandInterfaces {
  public static void main(String args[]) {
    // fountainpen p = new fountainpen();
    // p.write();
    // p.changeNib();
    human h = new human();
    h.sleep();
    h.speak();
    // e human ko monkey thara use karo
    monkey m1 = new human();
    m1.jump();
    // m1.speak(); cannot use speak method because the reference is monkey which
    // doesnt have speak method
    BasicAnimal b = new human();
    b.eat();
  }
}

// abstract class pen {
// abstract public void write();

// abstract public void refill();
// }

// class fountainpen extends pen {
// public void write() {
// System.out.println("writing...");
// }

// public void refill() {
// System.out.println("refilling...");
// }

// public void changeNib() {
// System.out.println("changing nib...");
// }
// }
class monkey {
  public void jump() {
    System.out.println("jumping...");
  }

  public void bite() {
    System.out.println("biting...");
  }
}

interface BasicAnimal {
  public void eat();

  public void sleep();
}

class human extends monkey implements BasicAnimal {
  public void speak() {
    System.out.println("hello sir...");
  }

  public void eat() {
    System.out.println("eating..");
  }

  public void sleep() {
    System.out.println("sleeping...");
  }
}