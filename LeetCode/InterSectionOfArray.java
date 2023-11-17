import java.util.*;

class InterSectionOfArray{
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};

       intersection(nums1, nums2);
    }

     public static void intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(Integer n:nums1){
            set1.add(n);
        }

       Set<Integer> set2=new HashSet<>();
        for(Integer n:nums1){
            set2.add(n);
        }

         set1.retainAll(set2);
         System.out.println(set1);
    }
}