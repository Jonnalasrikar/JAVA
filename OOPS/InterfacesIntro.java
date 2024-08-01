// Java interface is a group of related methods with empty bodies
//uses implemets keyword
//all the methods in interface are abstract
//you need to implemennt all the methods in interface
class InterfacesIntro {
  public static void main(String args[]) {
    AvonCycle cycle = new AvonCycle();
    cycle.applyBrake(30);
    System.out.println(cycle.a);
    // cycle.a = 50;
    // System.out.println(cycle.a);
    cycle.blowhornkg3();

  }

}

// interface methods ko hum public banana padatha
// interface implements mutilple classess
// you can create properties in interfaces
// you cannot modify the properties in interfaces as they are final
//always inetrfaces methods are public
//it is not necessary to overide the properrties in interface
interface Bicycle {
  int a = 45;

  void applyBrake(int decrement);

  void speedUp(int increment);

}

interface blowhorn {
  void blowhornkg3();

  void blowhornkg4();
}

class AvonCycle implements Bicycle, blowhorn {
  int speed = 7;

  void blowhorn() {
    System.out.println("pee pee poo poo");
  }

  public void applyBrake(int decrement) {
    System.out.println("applying brake");
  }

  public void speedUp(int increment) {
    System.out.println("speeding up");
  }

  public void blowhornkg3() {
    System.out.println("blowing horn 3");
  }

  public void blowhornkg4() {
    System.out.println("blowing horn 4");
  }
}