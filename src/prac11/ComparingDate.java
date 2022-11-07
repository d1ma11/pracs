package prac11;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ComparingDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar userDate = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();

        System.out.print("Input a year: ");
        currentDate.set(Calendar.YEAR, sc.nextInt());
        System.out.print("Input a month: ");
        int month = sc.nextInt();
        switch (month) {
            case 1 -> currentDate.set(Calendar.MONTH, Calendar.JANUARY);
            case 2 -> currentDate.set(Calendar.MONTH, Calendar.FEBRUARY);
            case 3 -> currentDate.set(Calendar.MONTH, Calendar.MARCH);
            case 4 -> currentDate.set(Calendar.MONTH, Calendar.APRIL);
            case 5 -> currentDate.set(Calendar.MONTH, Calendar.MAY);
            case 6 -> currentDate.set(Calendar.MONTH, Calendar.JUNE);
            case 7 -> currentDate.set(Calendar.MONTH, Calendar.JULY);
            case 8 -> currentDate.set(Calendar.MONTH, Calendar.AUGUST);
            case 9 -> currentDate.set(Calendar.MONTH, Calendar.SEPTEMBER);
            case 10 -> currentDate.set(Calendar.MONTH, Calendar.OCTOBER);
            case 11 -> currentDate.set(Calendar.MONTH, Calendar.NOVEMBER);
            case 12 -> currentDate.set(Calendar.MONTH, Calendar.DECEMBER);
        }
        System.out.print("Input a day of month: ");
        currentDate.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        System.out.print("Input an hour of day: ");
        currentDate.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        System.out.print("Input a minute: ");
        currentDate.set(Calendar.MINUTE, sc.nextInt());
        System.out.print("Input a second: ");
        currentDate.set(Calendar.SECOND, sc.nextInt());


        System.out.println(userDate.getTime());
        System.out.println(currentDate.getTime());

        if (!userDate.before(currentDate)) {
            System.out.println("Your date is after a current date(today)");
        } else {
            System.out.println("Your date is before current date(today)");
        }
    }
}
