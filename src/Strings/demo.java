package Strings;

public class demo {
    public static void main(String[] args) {
        int[] a= {1,3,2};
        //System.out.println(isMonotonic(a));
        System.out.println((Double)Math.pow(0, 1)); 
    }

    public static boolean isMonotonic(int[] a) {
        boolean increasing = true;
        boolean decreasing = true; 
        int i = 0;
        int j = a.length -1;

        while(i <= j){
                if(a[i] > a[j] && increasing) {
                    decreasing = false;
                }

                else if(a[i] < a[j] && decreasing){
                    increasing = false;
                }
                else if(a[i] == a[j]){
                }
                
                else{
                    return false;
                }
                i++;j--;
        }

        return true;
    }
}
