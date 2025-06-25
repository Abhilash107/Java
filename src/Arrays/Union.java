package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};

        ArrayList<Integer> res = unions(arr1, arr2);
        System.out.println(res);


    }

    public static ArrayList<Integer> unions(int a[], int b[]){
        int n = a.length;
        int m = b.length;

//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i = 0;i < Math.max(n, m);i++){
//            if(i < a.length)set.add(a[i]);
//            if(i < b.length)set.add(b[i]);
//        }
//
//        int res[] = new int[set.size()];
//        int i = 0;
//        for(int s: set){
//            res[i] = s;
//            i++;
//
//        }
//
//        return res;


        //using Two pointer(IMP)
        ArrayList<Integer> list = new ArrayList<>();

        int l= 0, r = 0;

        while( l < n && r < m){
            if(a[l] > b[r]){
                if(list.isEmpty() || list.get(list.size() -1) != b[r]){
                    list.add(b[r]);

                }
                r++;
            }

            else if(a[l] < b[r]){
                if(list.isEmpty() || list.get(list.size() -1) != a[l]){
                    list.add(a[l]);

                }
                l++;
            }
            else{
                if(list.isEmpty() || list.get(list.size() -1) != b[r]){
                    list.add(b[r]);
                }

                l++;r++;
            }

        }

        while( l < n) {
            if(list.isEmpty() || list.get(list.size() -1) != a[l]){
                list.add(a[l]);

            }
            l++;

        }

        while( r < m) {
            if(list.isEmpty() || list.get(list.size() -1) != b[r]){
                list.add(b[r]);

            }
            r++;
        }

        return list;
    }
}
