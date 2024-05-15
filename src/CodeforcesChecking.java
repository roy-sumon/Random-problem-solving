import java.util.Scanner;

public class CodeforcesChecking{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            char c = scanner.next().charAt(0);
            if (c >= 'a' && c <= 'z' && "codeforces".contains(String.valueOf(c))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}