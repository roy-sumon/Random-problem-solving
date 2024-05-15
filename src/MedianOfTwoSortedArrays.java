import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 1,3);
        Collections.addAll(list2, 2);
        list1.addAll(list2);
        Collections.sort(list1);

//        System.out.println(list1);

        if(list1.size() % 2 !=0){
            int s = list1.size()/2;
//            System.out.println("frist condition");
            System.out.println("Median:"+list1.get(s));
        }
        if(list1.size() % 2 ==0){
//            System.out.println("second condition");
            int s = list1.size()/2-1;
            double m = list1.get(s);
            double n = list1.get(s+1);
            double median = (m+n)/2;
            System.out.println("Median: "+median);
        }
    }
}
