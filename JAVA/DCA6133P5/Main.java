import java.util.Scanner; // Import Scanner class for taking user input

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Read the first integer input from the user
        int num1 = scanner.nextInt();

        // Read the second integer input from the user
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the result (only the sum, as required by test cases)
        System.out.println(sum);

        // Close the Scanner to release resources
        scanner.close();
    }
}
