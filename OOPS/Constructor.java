//a member fn used to initialize the data members of the class

class Constructor {
  public static void main(String args[]) {
    //constructor overloading there can be more than 2 overloaded constructors
    employee sri = new employee("raja", 476);
    employee srii = new employee();
    // sri.setName("bangari");
    System.out.println(sri.getName());
    System.out.println(sri.getId());
    System.out.println(srii.getName());
    System.out.println(srii.getId());
  }
}

class employee {
  private int id;
  private String name;

  public employee() {
    id = 45;
    name = "srikar";
  }

  public employee(String myname, int myid) {
    id = myid;
    name = myname;
  }

  public void setName(String n) {
    name = n;
  }

  public void setId(int i) {
    id = i;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}