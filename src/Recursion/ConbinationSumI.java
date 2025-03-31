package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ConbinationSumI {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombos(0, target, candidates, ans, new ArrayList<Integer>());

        return ans;
    }
    public void getCombos(int ind, int t, int a[], List<List<Integer>> ans, List<Integer> temp){
        if(ind == a.length){
            if(t == 0){
                ans.add(new ArrayList<> (temp));
            }
            return;
        }


        if(a[ind] <= t){
            temp.add(a[ind]);
            getCombos(ind, t - a[ind], a, ans, temp);//take -> target updated
            temp.remove(temp.size() - 1);//remove the last element
        }

        getCombos(ind + 1, t, a, ans, temp);//don't take-> index ++

    }

}
