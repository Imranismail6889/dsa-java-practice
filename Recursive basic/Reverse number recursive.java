import java.util.Scanner;
public class RecursiveReverse {
    static int reverse(int n, int result) {
        if (n == 0) {
            return result;
        }
        return reverse(n / 10, result * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = reverse(n, 0);
        System.out.println("Reversed number: " + result);
        sc.close();
    }
}
