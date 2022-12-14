import java.time.LocalTime;
import java.util.Scanner;

public class chapter02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    public static double ex13() {
        double x1, x2;
        double y1, y2;

        System.out.println("enter the value of x1 and x2\n");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();

        System.out.println("enter the value of y1 and y2\n");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();

        double m = (y2 - y1) / (x2 - x1);
        double c = y1 / (m * x1);

        System.out.println("the slope is " + c);
        return c;
    }

    public static void ex14() {

        // 45903
        // final int MIDNIGHT = 86400;
        int hour;
        int miniutes;
        int seconds;
        do {

            System.out.println("please enter the hour");
            hour = sc.nextInt();
            if (hour >= 0 && hour <= 24) {
                break;
            } else {
                System.out.println("please enter a valid value");
                continue;
            }
        } while (!(hour >= 0 && hour <= 24));

        do {

            System.out.println("please enter the miniute");
            miniutes = sc.nextInt();
            if (miniutes >= 0 && miniutes <= 59) {
                break;
            } else {
                System.out.println("please enter a valid value");
                continue;
            }
        } while (!(miniutes >= 0 && miniutes <= 59));

        do {

            System.out.println("please enter the seconds");
            seconds = sc.nextInt();
            if (seconds >= 0 && seconds <= 59) {
                break;
            } else {
                System.out.println("please enter a valid value");
                continue;
            }
        } while (!(seconds >= 0 && seconds <= 59));

        // 1-hour (3 - 24 21
        // min 45 -60 15
        // sec 3 - 60 57
        // how to get mid night time in java
        LocalTime midnight = LocalTime.MIDNIGHT;
        int currentMin = hour * miniutes;
        int currentSec = currentMin * seconds - 3600;
        // int result = midnight - currentSec;

        System.out.println("the time since midnight is " + midnight);
    }

    public static void ex15() {
        int coffecient;
        double displacement;
        double initialLenght;
        double temperature;

        System.out.println("please enter the value of the coffecient");
        coffecient = sc.nextInt();
        System.out.println("please enter the value of the initial lenght ");
        initialLenght = sc.nextInt();
        System.out.println("please enter the value of the temperature");
        temperature = sc.nextInt();

        displacement = coffecient * initialLenght * temperature;

        if (displacement >= 0) {
            System.out.println("the material will expand by " + displacement);
        } else {
            System.out.println("the material will contract by " + displacement);
        }

    }

    public static void ex16() {
        String isMale;

        System.out.println("are you male or female ");
        isMale = sc.next();

        if () {
            
        }
    }
}