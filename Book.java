package Class_Book;

public class Book {
    // có 4 thuộc tính:
    private int bookID;
    private String name;
    private int price;
    private String author;
    // constructor

    public Book() {
    }

    public Book(int bookID, String name, int price, String author) {
        this.bookID = bookID;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int check(){
        int resutl=0;

        return resutl;
    }

}
