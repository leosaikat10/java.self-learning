import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        // 1. Store the original value to compare later
        int originalNum = n;
        int reverse = 0;

        // 2. Reverse the number
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        // 3. Compare the original number with the reversed one
        if (originalNum == reverse) {
            System.out.println("The number " + originalNum + " is a palindrome.");
        } else {
            System.out.println("The number " + originalNum + " is not a palindrome.");
        }

        sc.close();
    }
}