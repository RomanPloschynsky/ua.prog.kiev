import java.util.ArrayList;

/**
 * Created by exite on 21.07.16.
 */
public class Book {
    private int id;
    private String name;
    private ArrayList<Author> authors = new ArrayList();
    private String publishingHouse;
    private int publishingYear;
    private int pagesCount;
    private double price;
    private Cover cover;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Author author) {
        authors.add(author);
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cover getCover() {return cover;}

    public void setCover(Cover cover) {this.cover = cover;}

    public static Book[] makeBooksArray(int n) {
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            books[i].setId(i+1);
            books[i].setName(String.valueOf(Point.makeRndmNmbr(n*100)));
            books[i].setAuthors(Author.makeRndmAuthor(Point.makeRndmNmbr(5)));
            books[i].setPublishingHouse("somePublishingHouse - it is the same for every book");
            books[i].setPagesCount(Point.makeRndmNmbr(n*800));
            books[i].setPrice(Point.makeRndmNmbr(n*100));
            books[i].setCover(Cover.makeRndmCvr(Point.makeRndmNmbr(3)));
        }
        return books;
    }

    public ArrayList<Book> getSameAuthorBooks(String author, Book[] books) {
        ArrayList<Book> sameAuthorBooks = new ArrayList();
        for (int i = 0; i < books.length; i++) {
            for(int k = 0; k < books[i].authors.size(); k++) {
                if (books[i].authors.get(k).equals(author)) {
                    sameAuthorBooks.add(books[i]);
                }
            }
        }
        return sameAuthorBooks;
    }

    public ArrayList<Book> getSamePublisherBooks(String publishingHouse, Book[] books) {
        ArrayList<Book> samePublisherBooks = new ArrayList();
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishingHouse.equals(publishingHouse)) {
                samePublisherBooks.add(books[i]);
            }
        }
        return samePublisherBooks;
    }

    public ArrayList<Book> getSomePeriodPblshdBooks(int year, Book[] books) {
        ArrayList<Book> somePeriodPblshdBooks = new ArrayList();
        for (int i = 0; i < books.length; i++) {
            if (books[i].publishingYear > year) {
                somePeriodPblshdBooks.add(books[i]);
            }
        }
        return somePeriodPblshdBooks;
    }

}
