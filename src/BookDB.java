public class BookDB {
    private String sku;
    private String author;
    private String bookname;
    private String description;
    private double price;

    public BookDB() {
    }

    public BookDB(String author, String bookname, String description, double price) {
        this.author = author;
        this.bookname = bookname;
        this.description = description;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
