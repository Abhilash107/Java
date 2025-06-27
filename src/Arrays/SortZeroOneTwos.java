package Arrays;

import java.util.Arrays;

public class SortZeroOneTwos {

    public static void main(String[] args) {

        int a[] = {0,0, 2,1,2,1,2,2,1,};
        sortColors(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int z =0, o = 0, t= 0;

        for(int x: nums){
            if(x == 0) z++;
            else if(x == 1) o++;
            else t++;
        }

        for(int i = 0; i < n;i++){
            if(z!=0){
                nums[i] = 0;z--;
            }

            else if(o!=0){
                nums[i] = 1;o--;
            }

            else if(t!=0){
                nums[i] = 2;t--;
            }
        }
    }
}
