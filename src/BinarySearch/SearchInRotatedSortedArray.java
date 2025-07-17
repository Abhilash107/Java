package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public static int search(int[] a, int target) {
        int n = a.length;

        int l = 0, h = n - 1;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(a[mid] == target)return mid;


            //find the sorted half and search in them(classic BS)
            if(a[l] <= a[mid]){
                if(a[l] <= target && target <= a[mid]){
                    h = mid - 1;
                }
                else l = mid + 1;
            }

            else{
                if(a[mid] <= target && target <= a[h]){
                    l = mid + 1;
                }
                else h = mid - 1;
            }
        }

        return -1;
    }
}
