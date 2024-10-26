package Arrays;
import java.util.*;

public class deleteAtAny {
    public static void main(String[] args) {
        int[] a = new int[10];
        int num = 1;
        for (int i = 0; i < 7; i++) {
            a[i] = num; 
            num++;
        }

    System.out.println(Arrays.toString(a));
    int position = 4;
    if(position > 0 && position <= a.length){
        for(int i = position-1;i < a.length-1;i++){
            a[i] = a[i+1];
        }
        a[a.length - 1] = 0; 
    }
    System.out.println(Arrays.toString(a));




    }
}
