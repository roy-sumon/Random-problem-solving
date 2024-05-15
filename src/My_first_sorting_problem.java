import java.util.Scanner;

public class My_first_sorting_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<b){
                System.out.print(a);
                System.out.print(" "+b);
            }else {
                System.out.print(b);
                System.out.print(" "+a);
            }
        }
    }
}
