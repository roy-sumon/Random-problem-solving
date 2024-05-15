public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
