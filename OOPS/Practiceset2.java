class Practiceset2 {
  public static void main(String args[]) {
    cellphone c1 = new cellphone();
    c1.ringing();
    c1.vibrating();

  }
}

class cellphone {
  public void ringing() {
    System.out.println("ringing.....");
  }

  public void vibrating() {
    System.out.println("vibrating.....");
  }
}