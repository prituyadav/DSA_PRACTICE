import java.util.Arrays;

public class MaximumConsecutive {

    public static void main(String[] args){
        //call your method here
    }
    
      
   
   public int maxConsecutive(int bottom, int top, int[] special) {
        int maxDiff = Integer.MIN_VALUE;
        Arrays.sort(special);
        maxDiff = Math.max(maxDiff, special[0] - bottom);
        maxDiff = Math.max(maxDiff, top - special[special.length - 1]);
        
        for (int i = 0; i < special.length - 1; i++) {
            int floor1 = special[i];
            int floor2 = special[i + 1];
            
            int diff = floor2 - floor1 - 1;
            maxDiff = Math.max(maxDiff, diff);
        }
        
        return maxDiff;
    }
    
}
