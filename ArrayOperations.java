class ArrayOperations {
  public static void main(String args[]) {
    float arr[] = { 1.5f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f };
    // System.out.println(arr[0]);

    // // length
    // System.out.println(arr.length);

    // // display array
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // display array in reverse order
    // for (int i = arr.length - 1; i >= 0; i--) {
    //   System.out.println(arr[i]);
    // }

    // for each loop

    for (float i : arr) {
      System.out.println(i);
    }
  }

}