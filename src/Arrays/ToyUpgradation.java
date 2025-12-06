package Arrays;

import java.util.Arrays;

public class ToyUpgradation {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};

        int b[] = {1,1,2,3};
        System.out.println(equalsCntII(a, b, 2));

        System.out.println(Integer.parseInt(Integer.toBinaryString(23)) ^ 1);
    }

    public static int equalsCnt(int a[], int b[], int k){
        int n = a.length;
        int sameCnt = 0;

        for(int i = 0;i < n;i++){
            if(a[i] == b[i])sameCnt += 1;
            else if (a[i] == b[i] + 1) {
                if(k > 0){
                    k -= 1;
                    sameCnt++;
                }
            }
        }
        return sameCnt;

    }

    public static int equalsCntII(int a[], int b[], int k){
        int n = a.length;
        int res = 0;
        int diffArr[] = new int[n];

        for(int i = 0;i < n;i++){
            diffArr[i] = a[i] - b[i];
        }

        Arrays.sort(diffArr);
        for(int i = 0;i < n;i++){
            if( k > 0 && diffArr[i] == 1){
                k -= 1;
                res = i + 1;
            }
        }
        return res;

    }

}
