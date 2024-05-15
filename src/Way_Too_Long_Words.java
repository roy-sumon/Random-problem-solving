import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int count=0;
        if (w.length()<=10){
            System.out.println(w);
        } else{
            for (int i=1; i<=w.length(); i++){
                count++;
            }
            System.out.print(w.charAt(0));
            System.out.print(count-2);
            System.out.print(w.charAt(w.length()-1));
        }
    }
}
