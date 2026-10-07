import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            } 
            else if (numbers[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
        sc.close();
    }
}
