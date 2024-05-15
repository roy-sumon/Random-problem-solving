import java.util.ArrayList;

public class UniqueNumber {
    public static void main(String[] arg){
        int num[] = {1,2,3,1,2,5,1,1};
        ArrayList arr = new ArrayList();
        int n = num.length;
        int count = 0;
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(num[i] == num[j]){
                    count = count+1;
                    arr.add(num[i]);
//                    num2.push(num[i]);
                }
            }
        }

        System.out.println(arr);
        System.out.println(count);

    }
}
