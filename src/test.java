import java.util.Scanner;
public class test {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            int t = sc.nextInt();

            float dis =s*t;
            float mil = dis / 12;
            System.out.printf("%.3f\n", mil);
        }
}

