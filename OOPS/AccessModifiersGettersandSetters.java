//access modifiers-public,private,protected,default
//specifier where a property /method is accessible 

class AccessModifiersGettersandSetters {
  public static void main(String args[]) {
    employee sri = new employee();
    // sri.id = 59;
    // sri.name = "srikar";//throws an error because of private access modifier
    //private cant be accessed outside the class
    //private cant be accessed using . operator 
    //we need to use getters and setters
    sri.setName("srikar");
    System.out.println(sri.getName());
    sri.setId(49);
    System.out.println(sri.getId());
  }
}

class employee {
  private int id;
  private String name;

  // int id;
  // String name;
  // setters
  public void setName(String n) {
    name = n;
  }

  public void setId(int i) {
    id = i;
  }

  // getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}