package BinarySearch;

public class MinTimeToRepair {
    public static void main(String[] args) {

    }
    public long repairCars(int[] ranks, int cars) {
        long l = 1, r = ranks[0];

        for(int x: ranks) r = Math.max(r, x);

        r = r * cars * cars;

        while(l <= r){
            long mid = l + (r - l) / 2;

            if(canRepair(ranks, mid, cars)){
                r = mid -1;
            }
            else  l = mid +1;

        }

        return l;

    }

    boolean canRepair(int []ranks, long mid, int cars){
        int count = 0;

        for(int x : ranks){
            count += (long)Math.sqrt(mid/x);
            if(count >= cars)return true;
        }

        return false;

    }
}
