import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int currentPassengers = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            currentPassengers -= a[i];
            currentPassengers += b[i];

            if (currentPassengers > maxCapacity) {
                maxCapacity = currentPassengers;
            }
        }
        System.out.println(maxCapacity);
    }
}
