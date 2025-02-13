package Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int a1[] = {4,1,2};
        int a2[] = {1,3,4,2};

        int res[] = nextGreaterElement(a1, a2);
        for(int e: res){
            System.out.print(e+ " ");
        }

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        int i = 0, j =0;
        int n = nums1.length;
        while(i < n){
            while(j < nums2.length){
                if(nums1[i] < nums2[j]){
                    res[i] = nums2[j];
                    j++;break;
                }
                j++;
            }
            i++;
        }

        return res;
    }
}
