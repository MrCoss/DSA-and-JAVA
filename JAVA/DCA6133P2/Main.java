package JAVA.DCA6133P2;

import java.util.Scanner;

class Year {
    private int year;
    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        Year y = new Year(inputYear);
        System.out.println(y.isLeapYear() ? "is a leap year." : "not a leap year.");
        scanner.close();
    }
}
