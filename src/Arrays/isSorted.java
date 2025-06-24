package Arrays;

public class isSorted {
    public static void main(String[] args) {

//        int[] a = {2,5,3,2,9,6,7,5,4,5};
        int[] a = {};

        boolean res = checkSorted(a);
        System.out.println(res);


    }

    public static boolean checkSorted(int a[]){

        if(a.length <= 1) return true;

        int n = a.length;

        for(int i = 0;i < n - 1;i++){
            if(a[i] > a[i+1]) return false;
        }

        return true;
    }

//    public boolean check(int[] a) {
//
//        int n = a.length;
//        int k = 1;
//
//        for(int i = 0; i< n;i++){
//
//        }
//    }
}
