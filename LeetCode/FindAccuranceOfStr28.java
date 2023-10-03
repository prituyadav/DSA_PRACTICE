import java.util.Scanner;

public class FindAccuranceOfStr28 {
    public static void main(String[] arr){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        sc.close();

        solution(str1, str2);
    }

    public static void solution(String str1, String str2){

        // if(str2.length()>str1.length())
        // System.out.println(-1);
        

        int ans=-1;
        for(int i=0; i<=str1.length()-str2.length(); i++){
            if(str1.substring(i,  i + str2.length()).equals(str2)){
                ans=i;
                break;
            }
        }
        System.out.println(ans);

        // if(str1.contains(str2)){
        //     System.out.println(str1.indexOf(str2));
        // }

    }

}
