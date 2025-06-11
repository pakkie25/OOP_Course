package lab7.task2;

public class Main {
    public static void main (String [] args){
        Book myBook = new Book();

        myBook.setTitle("Аліса в Країні Чудес");
        myBook.setAuthor("Льюїс Керрол");
        myBook.setPrice(185);

        myBook.displayInfo();
    }

}