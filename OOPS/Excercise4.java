
//you have to implement a libraray using java class libraray
//methods:issue book, return book, show available books
//properties:array to store the available books
//array to store the issued books
import java.util.*;

class Excercise4 {
  public static void main(String args[]) {
    library centarlLibrary = new library();
    centarlLibrary.addbook("Harry Potter");
    centarlLibrary.addbook("rich dad poor dad");
    centarlLibrary.addbook("bhaagavatgita");
    // centarlLibrary.showavailablebooks();
    centarlLibrary.issuebook("rich dad poor dad");
    centarlLibrary.showavailablebooks();
    centarlLibrary.addbook("c++");
    centarlLibrary.showavailablebooks();
  }
}

class library {
  String books[];
  int no_of_books;

  library() {
    this.books = new String[100];
    this.no_of_books = 0;
  }

  void addbook(String book) {
    this.books[no_of_books] = book;
    no_of_books++;
    System.out.println(book + " book has been added");
  }

  void issuebook(String book) {
    for (int i = 0; i < no_of_books; i++) {
      if (books[i].equals(book)) {
        System.out.println("book has been issued");
        books[i] = null;
        return;
      }
    }
    System.out.println("this book is not available");

  }

  void showavailablebooks() {
    for (String a : books) {
      if (a == null)
        continue;
      System.out.println(a);
    }
  }

  void returnbook(String a) {
    addbook(a);
  }
}