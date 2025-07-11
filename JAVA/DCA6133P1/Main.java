package DCA6133P1;
import java.util.Scanner;

public class Main {
    public static int reverseRecursive(int num, int rev) {
        if (num == 0) return rev;
        return reverseRecursive(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(reverseRecursive(num, 0));
        scanner.close();
    }
}
