package Recursion;

public class intro {
    public static void main(String[] args) {
        printAscending(10);
        System.out.println();
        printDescending(10);
        System.out.println();
        f(2);
        f2(0, 2);

        int a[] = {1,2,3,4};
        reverseArr(a, 0, a.length-1);// if using two pointer take right pointer as a.len - 1
        reverseArr2(a, 0, a.length);// if using two pointer take right pointer as a.len - 1
        for(int x: a) System.out.print(x+ " ");
//        String s= "mawm";
//        System.out.println(isPalindrome(s, 0, s.length() - 1));


    }

    public static void printAscending(int N){
        
        if (N == 0) return;  // Base case
        
        // Recursive call first to print in ascending order
        printAscending(N - 1);
        
        // Print after the recursive call to get numbers in ascending order
        System.out.print(N+" ");
    }

    public static void printDescending(int N){
        
        if (N == 0) return;  // Base case
        // Print before the recursive call to get numbers in descending order
        System.out.print(N+" ");
        // Recursive call to print in descending order
        printDescending(N - 1);
        
       
        
    }

    public static void f(int n){
        if(n == 0)return;
        System.out.println("Hehe");
        f(--n);

    }

    public static void f2(int i, int n){
        if(i >= n)return;
        System.out.println("Hehe");
        f2(i+1, n);

    }

    public static void reverseArr(int[] a, int l , int r){
        if(l > r)return;
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;

        reverseArr(a, l+1, r-1);
    }

    public static void reverseArr2(int[] a, int i, int n){
        if(i >= n/2)return;
        int temp = a[i];
        a[i] = a[n - i - 1];
        a[n - i - 1] = temp;

        reverseArr2(a, i + 1, n);
    }

    public static boolean isPalindrome(String a, int l , int r){
        if(l > r)return true;
        if (a.charAt(l) != a.charAt(r))return false;


        return isPalindrome(a, ++l, --r);
    }
}

