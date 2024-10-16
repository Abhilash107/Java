package Recursion;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        revArray(a, 0, a.length-1);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    public static void revArray(int[] a, int s, int e){
        if(s >= e) return;

        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;

        revArray(a, s+1, e-1);
        
    }
}
