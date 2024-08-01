import java.util.*;

class ArraysPracticeSet {
  public static void main(String args[]) {
    // problem1
    // float a[]={1,2,3,4,5};
    // float sum=0;
    // for(float i :a)
    // {
    // sum=sum+i;
    // }
    // System.out.println(sum);

    // //problem 2
    // float b=5.0f;
    // boolean c=false;
    // for(float i :a)
    // {
    // if(i==b)
    // {
    // c=true;
    // break;
    // }
    // }
    // System.out.println(c);
    // //problem 3
    // int a[] = { 99, 98, 96, 99, 59 };
    // float sum = 0f;
    // for (int i : a) {
    // sum = sum + i;
    // }
    // System.out.println(sum / (a.length));

    // problem 4
    // int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
    // int b[][] = { { 2, 6, 3 }, { 4, 7, 1 } };
    // int c[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
    // for (int i = 0; i < a.length; i++) {
    // for (int j = 0; j < a[i].length; j++) {
    // c[i][j] = a[i][j] + b[i][j];
    // }
    // }
    // for (int i = 0; i < a.length; i++) {
    // for (int j = 0; j < a[i].length; j++) {
    // System.out.print(c[i][j] + " ");
    // }
    // System.out.println();
    // }

    // problem 5
    int a[] = { 1, 2, 3, 4, 5 };
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }
    System.out.println(Arrays.toString(a));

  }
}