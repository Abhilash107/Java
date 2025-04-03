package Recursion;

import java.util.*;

public class combinationSumI {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombos(0, target, candidates, ans, new HashSet<Integer>());

        return ans;
    }
    public void getCombos(int ind, int t, int a[], List<List<Integer>> ans, Set<Integer> temp){
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

    public static class CombinationalSumII {
        public static void main(String[] args) {

        }

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            getCombos(0, target, candidates, ans, new ArrayList<Integer>());

            return ans;
        }
        public void getCombos(int ind, int t, int a[], List<List<Integer>> ans, List<Integer> temp){
            if(t == 0){
                ans.add(new ArrayList<> (temp));
                return;
            }

            for(int i = ind;i < a.length;i++){
                if(i > ind && a[i] == a[i-1])continue;

                if(a[i] > t)break;

                temp.add(a[i]);
                getCombos(i + 1, t - a[i] , a, ans, temp);//take -> target updated
                temp.remove(temp.size() - 1);//remove the last element
            }




        }
    }
}
