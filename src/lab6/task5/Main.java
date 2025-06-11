package lab6.task5;

public class Main {
    public static void main(String[]args){
        Book myBook1 = new Book("Створенний в безодні", "Цукусі Акіхіто");
        Book myBook2 = new Book("Неймовірні пригоди Джо Джо");

        myBook1.printInfo();
        myBook2.printInfo();
    }
}