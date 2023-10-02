

public class PalindromeNumber {

    public static void main(String[] args){
        //call your method here
    }

   public boolean isPalindrome(int x) {
         if (x < 0) return false;
        int ans = 0;
        int num = x;
        while ( num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        if (ans != x) return false;
        return true;
   }
}
