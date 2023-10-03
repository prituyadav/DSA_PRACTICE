package faangDsaChallenge.microsoft;

//https://leetcode.com/problems/rotate-function/


public class RotateFunction{

    public static void main (String[] args){
        // call your method here
        
    }

    public int maxRotateFunction (int[] A) {
        if (A == null || A.length == 0)
            return 0;
        int sum = 0, F0 = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum += A [i];
            F0 += i * A [i];
        }
        int dp [] = new int [A.length];
        dp [0] = F0;
        max = dp [0];
        for (int i = 1; i < A.length; i++) {
            dp [i] = dp [i-1] + sum - A.length * A [A.length - i];
            max = Math.max (max, dp [i]);
        }
        return max;
    }

}