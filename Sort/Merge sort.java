import java.util.Scanner;
public class MergeSort {
    static void merge(int[] numbers, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = numbers[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = numbers[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        mergeSort(numbers, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}
