package lab7.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock;
        clock = new Clock(16, 20, 58 );
        for (int i = 0; i < 8; i++) {
            clock.tick();
            clock.displayTime();
        }
    }
}