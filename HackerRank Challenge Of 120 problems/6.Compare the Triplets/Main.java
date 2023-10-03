import java.util.ArrayList;
import java.util.List;

public class Main{
  public static void main(String[] args){
   // List<Integer> ans=
    compareTriplets(null,null);   //pass your list

  }
   public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice=0;
        int bob=0;
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }
            else if(b.get(i)>a.get(i)){
                bob++;
            }
            else{
                continue;
            }
        }      
          
        ans.add(alice);
        ans.add(bob);
        
        return ans;
        
    }
}
 

