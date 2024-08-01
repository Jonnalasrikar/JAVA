class PracticeSet {
  public static void main(String args[]) {
    Employee sri = new Employee();
    sri.Name = "srikar";
    sri.Salary = 10000000;
    System.out.println(sri.getName());
    System.out.println(sri.getSalary());
    String name = "bangari";
    Sri.setName(name);
    System.out.println(sri.getName());
  }
}

class Employee {
  int Salary;
  String Name;

  public int getSalary() {
    return Salary;
  }

  public String getName() {
    return Name;
  }

  public void SetName(String n) {
    Name = n;
  }
}