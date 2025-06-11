package lab6.task4;

public class Main {
    public static void main(String[]args){
        Counter num1 = new Counter();
        Counter num2 = new Counter();

        num1.increment();
        num1.increment();
        num1.increment();
        num2.increment();
        num2.increment();

        System.out.println("Лічильник Counter num1: " + num1.getCount());
        System.out.println("Лічильний Counter num2: " + num2.getCount());

        StaticCounter.increment();
        StaticCounter.increment();
        StaticCounter.increment();
        StaticCounter.increment();

        System.out.println("Лічильник StaticCounter: " + StaticCounter.getCount());

        StaticCounter.increment();
        StaticCounter.increment();

        System.out.println("Лічильник StaticCounter після повторного додавання: " + StaticCounter.getCount());
    }
}