import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list1.add(9);
        list1.add(2);
        list1.add(9);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        for(int i=0; i<list1.size(); i++){
            int res1 = list1.get(i);
            int res2 = list2.get(i);
            int res = res1+res2;
            list3.add(res);
        }
        System.out.println(list3);

    }
}
