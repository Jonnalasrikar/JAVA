class DynamicMethodDispatch {
  public static void main(String args[]) {
    // Phone obj = new Phone();
    // Smartphone smobj=new SmatPhone();
    // obj.name();
    // reference is used phone but object is created for smartphone
    // super class reference subclass object
    // object is made at run time
    // this obj is refering to both classess but only override methods and
    // superclass methods can be called
    Phone obj = new SmartPhone();// smart phone is called as phone
    // but normal phone is not called as smart phone
    // SmartPhone obj2 = new Phone();not allowed
    obj.On();// method of objects
    obj.time();
    obj.music();

  }
}

class Phone {
  public void On() {
    System.out.println("Turning phone...");
  }

  public void time() {
    System.out.println("displaying time..");
  }
}

class SmartPhone extends Phone {
  @Override
  public void On() {
    System.out.println("Turning smartphone...");
  }

  public void music() {
    System.out.println("playing music...");
  }
}