import java.util.List;

public class Countpairs {
    public static void main(String[] args){
        System.out.println(1222);
        //call your tc here.
       System.out.println(solution(null, 0));
    }

    public static int solution(List<Integer> nums, int target){
        int cnt = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target)  cnt++;
            }
        }
        return cnt;
    }
    
}
