package lab7.task2;

public class Book {

    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Ціна не може бути від'ємною.");
        }
    }
    public double getPrice() {
        return price;
    }

    public void displayInfo(){
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Ціна: " + price + " грн");

    }

}
