import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    //Используйте класс Book (книга) из домашнего задания к уроку 45 (см. Book.java).
    //Создайте список книг и отсортируйте книги по названию,
    // (при одинаковых названиях - по автору) при помощи лямбда-функции.
    List<Book> bookList = new ArrayList<>();

    bookList.add(new Book("NameBook", "Author1", new Date("December 25, 1995 00:00:00")));
    bookList.add(new Book("BookName", "Author2", new Date("October 20, 2005 00:00:00")));
    bookList.add(new Book("NameBook", "Author3", new Date("May 05, 2012 00:00:00")));
    bookList.add(new Book("BBB", "Author4", new Date("September 05, 2012 00:00:00")));

    bookList.sort((Book o1, Book o2) -> {
      if (o1.getName().compareTo(o2.getName()) == 0) {
        return o1.getAuthor().compareTo(o2.getAuthor());
      }
      return o1.getName().compareTo(o2.getName());
    });

    Book.printBook(bookList);

    bookList.sort((Book o1, Book o2) -> o1.getDatePublication().compareTo(o2.getDatePublication()));
    System.out.println();

    Book.printBook(bookList);
  }
}