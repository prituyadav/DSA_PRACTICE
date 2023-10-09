import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicateII{
    public static void main(){
       Scanner sc=new Scanner(System.in);
       int length=sc.nextInt();
       int[] arr=new int[length];
       while(length-->0){
        arr[length]=sc.nextInt();
       }
       int k=sc.nextInt();

       sc.close();  
       
       System.out.println(containsNearbyDuplicate(arr,k));

    }

    public  static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ans=false;

        //tle----

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[j]==nums[i] && Math.abs(i-j)<=k){
        //             ans=true;
        //             break;
        //         }
        //     }
        // }


         Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k){
                 ans= true;
                break;
            }
            else{
                hashMap.put(integer, i);
            }
        }

        return ans;
    }
}