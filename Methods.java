//if static method is not used you need to create an object of the class
//stactic method -it is repalted to that class
class Methods {
  public static void main(String args[]) {
    int a = 1;
    int b = 6;
    Methods obj=new Methods();
    System.out.println(obj.logic(a, b));
  }

  int logic(int a, int b) {
    return a + b;
  }
}