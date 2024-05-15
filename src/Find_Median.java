public class Find_Median {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        int[] newArr = new int[arr1.length + arr2.length];
        int count=0;
        for(int i=0; i<arr1.length; i++){
            newArr[i]=arr1[i];
            count++;
        }
        for(int j=0; j<arr2.length; j++){
            newArr[count]=arr2[j];
            count++;
        }
        int newArrlen = newArr.length;

        if(newArrlen % 2 != 0){
            int res = newArrlen / 2;
            System.out.println(newArr[res]);

        }if (newArrlen % 2 == 0) {
            int res = (newArrlen / 2)-1;
            System.out.println(newArr[res]+".5");

        }
    }
}
