package Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int a[] = {0, 2};
        //unique no.
        //Range -> 0 to n

        int res = findMissingNum(a);
        System.out.println(res);

    }

    public static int findMissingNum(int a[]){
        //get max range sum i.e N
        //find the diff between sum of actual sums and sum of given array

        int sum = 0;
        int n = a.length;

        for(int x: a){
            sum += x;
        }

        int actSum = (n) * (n + 1) / 2;

        return actSum - sum;

    }


}
