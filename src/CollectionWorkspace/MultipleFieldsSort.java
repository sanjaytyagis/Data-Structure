package CollectionWorkspace;
import java.util.*;
import java.util.stream.Collectors;

public class MultipleFieldsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book(105, "Title 5", "Author2", 10);
        Book book2 = new Book(103, "Title 3", "Author1", 15);
        Book book3 = new Book(104, "Title 4", "Author2", 10);
        Book book4 = new Book(101, "Title 1", "Author1", 20);
        Book book5 = new Book(102, "Title 2", "Author2", 15);

        List<Book> unsortredBooksList = Arrays.asList(book1, book2, book3, book4, book5);
// Using Stream 
        Comparator<Book> idBookComparator = Comparator.comparing(Book::getId);

        Comparator<Book> titleBookComparator = Comparator.comparing(Book::getTitle);

        Comparator<Book> multipleFieldsComparator = idBookComparator.thenComparing(titleBookComparator);

        System.out.println("Unsorted Books List : ");

        for (Book book : unsortredBooksList) {
            System.out.println(book);
        }

        List<Book> sortedList1 = unsortredBooksList.stream().sorted(multipleFieldsComparator).collect(Collectors.toList());

        System.out.println("After sorting books list : ");


        for (Book book : sortedList1) {
            System.out.println(book);
        }
// Using Sort Method
        Collections.sort(unsortredBooksList, multipleFieldsComparator);

        System.out.println("After sorting books list 2: ");


        for (Book book : unsortredBooksList) {
            System.out.println(book);
        }

    }
}

class Book {

    private int id;
    private String title;
    private String author;
    private long price;

    public Book(int id, String title, String author, long price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}