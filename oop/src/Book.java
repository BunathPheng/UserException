import java.time.LocalDate;
import java.util.Arrays;

public class Book {
     private String UUID ;
     private String title ;
     private String[] author ;
     private LocalDate publishedDate ;
     private Integer numberOfPage;
     public Book(){

     }
    public Book(String UUID, String title, String[] author, LocalDate publishedDate, Integer numberOfPage) {
        this.UUID = UUID;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.numberOfPage = numberOfPage;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Integer getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(Integer numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "UUID='" + UUID + '\'' +
                ", title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publishedDate=" + publishedDate +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
class TextBook extends Book {
    public TextBook(String UUID, String title, String[] author, LocalDate publishedDate, Integer numberOfPage) {
        super(UUID, title, author, publishedDate, numberOfPage);
    }
}