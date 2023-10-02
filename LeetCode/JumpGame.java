
public class JumpGame {

    public static void main(String[] args){
        //call your method here
    }


public boolean canJump(int[] nums) {
        int n = nums.length;
        int lastTrue = n-1;
        for(int i = n-2;i>=0;i--){
            int jumpSize = nums[i];
            if(i+jumpSize >= n-1 || i+jumpSize>=lastTrue){ //can you jump from here and reach the end or atleast reach the point that can help reach the end?
                lastTrue = i;
            }
        }
        return lastTrue == 0;
    }
}
