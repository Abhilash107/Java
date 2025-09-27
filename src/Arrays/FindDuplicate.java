package Arrays;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
//        System.out.println(smallestNumber(1, 2));
        int arr[] = {4,5,4,5,4,5,6,1,2,5,6,7,4,2,3,1,2,3,6,7,6,7};
        ArrayList<Integer> ans = findDuplicates(arr, arr.length -1);
        System.out.println(ans);

    }

    public static int smallestNumber(int n, int t) {
        int x = n;
        while(product(x)%t != 0){
            x++;
        }
        return x;
        
        
    }
    public static int product(int n){
        int product = 1;
        int temp = n;
        while(temp > 0){
            if(product == 0) break;
            product *= (temp%10);
            temp /= 10;
        }
        return product;
    }

    public static ArrayList< Integer > findDuplicates(int[] arr, int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0;i <n;i++){
            arr[arr[i] % n] += n;
        }

        for(int i =0;i <n;i++){
            if((int)arr[i]/n > 1)
                list.add(i);
        }

        return list;
    }
    
}
