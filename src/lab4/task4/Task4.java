package lab4.task4;;

public class Task4 {
    public static void main(String[] args) {
        printInfo("Maksym");
        printInfo("Maksym", 17);
    }
    public static void printInfo(String name){
        System.out.println("Name: " + name);
    }
    public static void printInfo(String name, int age){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
