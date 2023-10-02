import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
    

public class CombinationSum {

    public static void main(String[] args){
        //call your method here
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target, int start) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <target) {
                for (List<Integer> ar : combinationSum(candidates, target - candidates[i], i)) {
                    ar.add(0, candidates[i]);
                    res.add(ar);
                }
            } else if (candidates[i] == target) {
                List<Integer> lst = new ArrayList<>();
                lst.add(candidates[i]);
                res.add(lst);
            } else
                break;
        }
        return res;
    }

}