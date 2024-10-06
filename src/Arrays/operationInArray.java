package Arrays;

public class operationInArray {
    public static void main(String[] args) {
        // int x = 5;
        // int y = 5;
        // while (x>0) {
        //     if(y == 1){
        //         x = 10;
        //     }
        //     System.err.println(x+" "+y);
        //     x--;
        //     y--;
        // }

        int[] a = {1,2,4,4,5};
        int repeat = repeatingElement(a);
        int missing = missingElement(a);
        System.out.println(repeat+" "+missing);
    }
    
    public static int repeatingElement(int[] arr){
        //If arrays is sorted;
        int element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(element != arr[i]) element = arr[i];
            else return element;
        }

        return -1;
    }

    public static int missingElement(int[] arr){
        int actualSum = ((arr.length) * (arr.length+1))/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return actualSum - (sum-repeatingElement(arr));
    }


}
