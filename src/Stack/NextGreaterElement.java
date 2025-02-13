package Stack;
import java.util.HashMap;
import java.util.Stack;

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
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums1.length;
        int m = nums2.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = m - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                map.put(nums2[i], stack.peek());
            } else {
                map.put(nums2[i], -1);
            }

            stack.push(nums2[i]);
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(nums1[i]);
        }

        return arr;//A map is taken to store the greater elements respectively(NO big deal)

    }
}
