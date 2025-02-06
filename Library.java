import java.util.ArrayList;

public class Library {
  ArrayList<Book> availBook;

  public Library() {
    this.availBook = new ArrayList<>();
  }


  public void addBook(Book book){
    availBook.add(book);
    System.out.println("Book added to library: " + book.name);
  }

  public void borrowBook(Borrower borrower, Book book){
    borrower.borrowBook(book);
    availBook.remove(book);
    System.out.println(borrower.name + " borrowed: " + book.name);
  }

  public void returnBook(Borrower borrower, Book book){
    availBook.add(book);
    borrower.removeBook(book);
    System.out.println(borrower.name + " returned: " + book.name);
  }

  public void displayLibraryBooks(){
    System.out.println("Books in Library:");
    for (Book book : availBook) {
      System.out.println("Title: " + book.name);
      System.out.println("ISBN: " + book.ISBN);
      System.out.println("Author: " + book.author.name);
      System.out.println("Biography: " + book.author.bio);
      System.out.println("----------------------------");
    }
  }
}
