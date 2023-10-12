public class SumOfAllDivisors {
    public static void main(String[] args) {
        int num= 45;
        int sum=1;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        
        System.out.println(sum);
    }
}
