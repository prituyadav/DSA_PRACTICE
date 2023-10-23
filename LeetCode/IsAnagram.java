import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        String ana=sc.next();

        System.out.println(str,ana);
        System.out.println(isAnagram(str, ana));
    }

     public static boolean isAnagram(String s, String t) {
         char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}