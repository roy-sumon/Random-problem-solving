import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println(a + " eh o maior");
        } else if (b>a && b>c) {
            System.out.println(b + " eh o maior");
        }else if (c>a && c>b){
            System.out.println(c + " eh o maior");
        }
    }
}