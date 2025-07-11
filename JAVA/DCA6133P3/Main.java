package JAVA.DCA6133P3;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger factorial(int n) {
        if (n <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
        scanner.close();
    }
}

