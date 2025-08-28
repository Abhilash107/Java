package Basics;

import java.util.ArrayList;

public class Siuuu {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0;i < 5;i++){
//            list.add(i+1);
//        }
//
//        //System.out.println(list);
//        for(int i = 0;i < 2;i++){
//            int x = list.get(0);
//            list.remove(0);
//            list.add(x);
//        }
//        System.out.println(list);
//        int a, b;
//        a = b = 10;

        //1.
//        try {
//            System.out.println("Inside");
//            throw new RuntimeException("Error");
//        }
//        finally {
//            System.out.println("Inside finally");
//        }
        //o/p:
//        Inside
//        Inside finally

        //2.
//        try{
//            System.exit(0);
//        }
//        finally {
//            System.out.println("Finally executed");//no output
//        }

        //3.
        Integer i =  10;
        Integer j =  20;

        //swap(i, j);

        //System.out.println(i + " " + j);// no change 10 20

        //4.
//        while(1){//boolean here no int
//
//        }

        //5.



        int A[] = {3,3,3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(len(A));




    }
    public static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static int len(int a[]){
        ArrayList<Integer> list = new ArrayList<>();

        int n = a.length;
        int l, maxLen;
        l  = maxLen = 0;

        list.add(a[0]);

//        while(list.size() != 2 && r < n) {
//
//            if (!list.contains(a[r])) {
//                list.add(a[r]);
//
//            }
//            r++;
//        }
        //System.out.println(list);
//        maxLen = (r - l);
//
//        r = r + 1;
//        for (; r < n;r++){
//            if(!list.contains(a[r])){
//                //r - 1;
//                int x =a[l];
//                //for(int j = 0;j < list.size();j++){
//                    //if(list.get(j) != x){
//                list.remove((Integer) x);
//                       // break;
//                    //}
//               // }
//                l++;
//
//                list.add(a[r]);
//
//            }
//            maxLen = Math.max(maxLen, (r - l + 1));
//        }


        for (int r = 0; r < n; r++) {
            if (!list.contains(a[r])) {
                if (list.size() == 2) {
                    // Remove the leftmost distinct integer
                    int toRemove = a[l];
                    while (l < r && a[l] == toRemove) {
                        l++;
                    }
                    list.remove((Integer) toRemove);
                }
                list.add(a[r]);
            }
            maxLen = Math.max(maxLen, r - l );
        }
        return maxLen;
    }
}
