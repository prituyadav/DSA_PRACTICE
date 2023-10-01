import java.util.HashSet;
import java.util.Set;

public class MakeArrayZerobySubtractingEqualAmounts{
    public static void main(String[] nums) {
        int[] arr={1,2,3,0,4,5,2};
        solution(arr);        
    }

    public static void solution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i >0){
                set.add(i);
            }
        }
        System.out.println(set.size());

    }
}
