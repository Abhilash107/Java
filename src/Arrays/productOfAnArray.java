package Arrays;

public class productOfAnArray {
    public static void main(String[] args) {
        int[] a= {1,2,0,4};
        int[] res = ans(a);
        for (int i : res) {
            System.out.print(i+" ");
        }

    }

    public static int[] ans(int[] arr){
        // Not optimal
        int[] answers = new int[arr.length]; 

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] != arr[j]){
                    product *= arr[j];  
                }  
            }
            answers[i] = product;
        }
        return answers;
    }

    
}
