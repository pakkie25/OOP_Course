package lab7.task5;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours){
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Години повинні бути в діапазоні між 0 і 23");
        }
    }
    public int getHours(){
        return hours;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Хвилини повинні бути в діапазоні між 0 і 59");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Секунди повинні бути в діапазоні між 0 і 59");
        }
    }

    public int getSeconds(){
        return seconds;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
                if (hours >= 24) {
                    hours = 0;
                }
            }
        }
    }
}
