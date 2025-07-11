package DCA6133P5;

import java.util.Scanner;

class GCDCalculator {
    public static int computeGCD(int a, int b) {
        return (b == 0) ? a : computeGCD(b, a % b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD is: " + GCDCalculator.computeGCD(a, b));
        scanner.close();
    }
}
