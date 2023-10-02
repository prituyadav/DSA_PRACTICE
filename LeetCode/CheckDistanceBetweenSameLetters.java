import java.util.HashMap;

public class CheckDistanceBetweenSameLetters {

    public static void main(String[] args){
        //call your method here
    }


    public static boolean checkDistances(String s, int[] distance) {
         HashMap<Character, Integer> map = new HashMap<>();
         
         
      for(int i = 0; i < s.length(); i ++) {
          if(! map.containsKey(s.charAt(i)))
           map.put(s.charAt(i), i + 1);

          else if(distance[s.charAt(i)-'a'] != i-map.get(s.charAt(i)))
           return false; 
      }
      return true;  
    }
}
