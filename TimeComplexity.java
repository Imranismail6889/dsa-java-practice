public class TimeComplexity {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("First number: " + n);
        System.out.println("O(n):");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("O(n^2):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
