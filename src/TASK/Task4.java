import java.util.Scanner;

public class Task4 {
// Palindrome Checker

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

       
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        
        if (original.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        input.close();
    }
}
