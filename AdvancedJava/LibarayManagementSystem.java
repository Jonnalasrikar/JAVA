import java.util.ArrayList;

/*
Create a libraray management system which is capable of issuing books to students and also can return the books.
book should info like :
1.book name
2.book author
3.issued to
4.issued on
User should be able to add books,return issued books,issued books
Assume that all the users are registered with their names in the central database




*/


class LibarayManagementSystem
  {
    public static void main(String args[])
    {
      ArrayList<Book> bk=new ArrayList<>();
      bk.add("");
      library l=new library(bk);
    }
  }
class book
  {
    String name,author,issued_to,issued_on;
  }
class library
  {
    ArrayList<book> books;
    public library(ArrayList<book> books)
    {
      this.books=books;
    }
    public void addbook(Book book)
    {
      System.out.println("this book has been added to library");
      this.books.add(book);
    }
    public void returnbook(Book book)
    {
      System.out.println("this book is returned");
      this.books.add(book);
    }
    public void issuebook(Book book,String issued_to,String issued_on)
    {
      System.out.println("this book is issued to "+issued_to+"on"+issued_on);
      this.books.remove(book);
    }
  }