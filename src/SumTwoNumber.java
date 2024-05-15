import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter array size ");
        int size = sc.nextInt();
        System.out.println("inter target value ");
        int tar = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("inter array elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean bol=false;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                if (arr[i] + arr[j] == tar) {
                    System.out.println(i +" "+ j);
                    bol=true;
                }
            }
        }
        if (!bol){
            System.out.println("item not found");
        }
    }
}
