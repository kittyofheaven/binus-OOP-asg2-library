import java.util.ArrayList;

public class Borrower {
  String name;
  ArrayList<Book> borrowedBooks;

  public Borrower(String name){
    this.borrowedBooks = new ArrayList<>();
    this.name = name;
  }

  public void borrowBook(Book book){
    borrowedBooks.add(book);
  }

  public void removeBook(Book book){
    borrowedBooks.remove(book);
  }

  public void displayBorrowedBooks(){
    System.out.println(this.name + "'s Borrowed Books:");
    for (Book book : borrowedBooks) {
      System.out.println("Title: " + book.name);
      System.out.println("ISBN: " + book.ISBN);
      System.out.println("Author: " + book.author.name);
      System.out.println("Biography: " + book.author.bio);
      System.out.println("----------------------------");
    }
  }
}
