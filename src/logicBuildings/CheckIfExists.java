package logicBuildings;
import java.util.HashSet;

public class CheckIfExists {
    public static void main(String[] args) {
        int []a ={1,0,5,6};
        System.out.println(checkIfExist(a));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0;i<arr.length;i++){
            if(set.contains(arr[i] * 2)) return true;
            if((arr[i]%2) == 0 && set.contains(arr[i]/2))return true;
            set.add(arr[i]);
        }
        return false;
    }
}
