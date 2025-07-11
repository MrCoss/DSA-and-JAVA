package DCA6133P4;

import java.util.Scanner;

public class Main {
    public static String checkPassFail(String input) {
        try {
            int marks = Integer.parseInt(input.trim());
            if (marks < 0 || marks > 100) return "Invalid marks range";
            return marks >= 35 ? "Passed" : "Failed";
        } catch (NumberFormatException e) {
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(checkPassFail(input));
        scanner.close();
    }
}

