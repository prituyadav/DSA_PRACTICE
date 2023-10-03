package faangDsaChallenge.microsoft;

public class BullsAndCows{
    public static void main(String[] args) {
       String secret = "1807", guess = "7810";

        Solution st=new Solution();
        st.getHint(secret,guess);
    }
}

//https://leetcode.com/problems/bulls-and-cows/

class Solution {
    public String getHint(String secret, String guess) {
        int bulls =0 , cows =0;

        int[] number = new int[10];

        for(int i=0;i<secret.length();i++){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s==g){
                bulls++;
            }
            else{
                if(number[s]++ < 0 ) cows++;
                if(number[g]-- > 0 ) cows++;
            }
        }

        return bulls +"A"+cows+"B";
    }
}