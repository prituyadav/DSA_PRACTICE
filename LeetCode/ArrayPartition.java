public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] table=new int[20002];
        for(int i:nums){
            table[i+10000]++;
        }
        int res=0;
        int cnt=0;
        for(int i=0;i<table.length;i++){
            if(table[i]!=0){
                int temp=cnt;
                cnt+=table[i];
                if((cnt+temp)%2==0){
                    res+=(i-10000)*table[i]/2;
                }else{
                    if(temp%2==0){
                        res+=(i-10000)*(table[i]+1)/2;
                    }else{
                        res+=(i-10000)*(table[i]-1)/2;
                    }
                }
            }
        }
        return res;
    }
}
