class BreakAndContinue {
  public static void main(String args[]) {
    // int i = 0;
    // for(int i=0;i<10;i++)
    // {
    // if(i==5)
    // break;
    // System.out.println(i);
    // }
    // while (i < 20) {
    // if (i == 10)
    // break;
    // System.out.println(i);
    // i++;
    // 
    // do {
    // if (i == 10)
    // break;
    // System.out.println(i);
    // i++;
    // } while (i < 20);
    for (int i = 0; i < 10; i++) {
      if (i == 2)
        continue;//moves next iteration
      System.out.println(i);
    }
  }
}56-=-