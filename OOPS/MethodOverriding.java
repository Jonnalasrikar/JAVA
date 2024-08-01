//method overloading ante same name but different parameters untaye
class MethodOverriding
  {
    public static void main(String args[])
    {
      // A a=new A();
      // a.meth2();
      B b=new B();
      b.meth2();
    }
  }
class A
  {
    public int a;
    public int harry()
    {
      return 4;
    }
    public void meth2()
    {
      System.out.println("Iam a method 2 of class A");
    }
  }
class B extends A
  {
    //meth2 ko apna implement karo
    // overrides the methods in a class
    @Override//to know whether override is happening or not
    //it overrides the method in class A
    public void meth2()
      { 
        System.out.println("Iam a method 2 of class b");
      }
    public void meth3()
      {
        System.out.println("Iam a method 3 of class b");
      }
  }