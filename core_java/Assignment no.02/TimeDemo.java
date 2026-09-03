class Time {

    int hr;
    int min;
    int sec;

    // Constructor
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    // Add two Time objects
    Time add(Time t) {

        int totalSec = this.sec + t.sec;
        int totalMin = this.min + t.min;
        int totalHr = this.hr + t.hr;

        // Carry seconds
        if (totalSec >= 60) {
            totalSec = totalSec - 60;
            totalMin++;
        }

        // Carry minutes
        if (totalMin >= 60) {
            totalMin = totalMin - 60;
            totalHr++;
        }

        // 24-hour format
        totalHr = totalHr % 24;

        return new Time(totalHr, totalMin, totalSec);
    }

    // Add integer as hours
    Time add(int hours) {

        int totalHr = this.hr + hours;

        totalHr = totalHr % 24;

        return new Time(totalHr, this.min, this.sec);
    }

    // Add integer as minutes
    Time addMinutes(int minutes) {

        int totalMin = this.min + minutes;
        int extraHours = totalMin / 60;

        totalMin = totalMin % 60;

        int totalHr = (this.hr + extraHours) % 24;

        return new Time(totalHr, totalMin, this.sec);
    }

    // Add integer as seconds
    Time addSeconds(int seconds) {

        int totalSec = this.sec + seconds;
        int extraMinutes = totalSec / 60;

        totalSec = totalSec % 60;

        int totalMin = this.min + extraMinutes;
        int extraHours = totalMin / 60;

        totalMin = totalMin % 60;

        int totalHr = (this.hr + extraHours) % 24;

        return new Time(totalHr, totalMin, totalSec);
    }

    // Display time
    void display() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }
}


public class TimeDemo {

    public static void main(String[] args) {

        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 20, 30);

        // Add two Time objects
        Time result1 = t1.add(t2);

        System.out.print("Addition of two Time objects: ");
        result1.display();


        // Add hours
        Time result2 = t1.add(5);

        System.out.print("Add 5 Hours: ");
        result2.display();


        // Add minutes
        Time result3 = t1.addMinutes(30);

        System.out.print("Add 30 Minutes: ");
        result3.display();


        // Add seconds
        Time result4 = t1.addSeconds(30);

        System.out.print("Add 30 Seconds: ");
        result4.display();
    }
}