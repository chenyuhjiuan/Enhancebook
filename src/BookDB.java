public class BookDB {
    private String sku;
    private String author;
    private String title;
    private String description;
    private double price;

    public BookDB() {
    }

    public BookDB(String author, String bookname, String description, double price) {
        this.author = author;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void getDisplayText(){

        System.out.println(getSku()+'\t'+'\t'+getTitle()+'\t'+'\t'+getAuthor()+'\t'+'\t'+getDescription()+'\t'+getPrice());
    }



}
