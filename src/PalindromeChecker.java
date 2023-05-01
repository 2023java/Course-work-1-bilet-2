import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " является палиндромом");
        } else {
            System.out.println(str + " не является палиндромом");
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}