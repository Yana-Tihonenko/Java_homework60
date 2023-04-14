import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Book {

  String name;
  String author;
  Date datePublication;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;

  }

  public Book(String name, String author, Date datePublication) {
    this.name = name;
    this.author = author;
    this.datePublication = datePublication;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getDatePublication() {
    return datePublication;
  }

  public void setDatePublication(Date datePublication) {
    this.datePublication = datePublication;
  }

  @Override
  public String toString() {
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    return "name=" + name + "  author=" + author +" data publication= "+ format.format(datePublication);

  }

  public static void printBook(List<Book> bookList) {
    for (Book book : bookList) {
      System.out.println(book.toString());

    }
  }


}

