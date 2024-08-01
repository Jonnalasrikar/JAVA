class CreatingOurOwnJavaClass {
  public static void main(String args[]) {
    System.out.println("this is a custom class ");
    employee sri = new employee();// instantiating a new employee object
    // setting attributes
    employee john = new employee();
    sri.id = 13;
    sri.name = "srikar";
    sri.salary = 34000;
    john.id = 13;
    john.name = "jonnala";
    john.salary = 50000;
    // System.out.println(sri.id);
    // System.out.println(sri.name);
    sri.printDetails();
    john.printDetails();
    int salary = john.getSalary();
    System.out.println(salary);
  }
}

// only one public class per file
class employee {
  int id;
  String name;
  int salary;

  public void printDetails() {
    System.out.println("my id is " + id);
    System.out.println("my name is " + name);
  }

  public int getSalary() {
    return salary;
  }

}
