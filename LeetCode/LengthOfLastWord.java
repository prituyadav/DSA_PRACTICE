
public class LengthOfLastWord {
    public static void main(String[] args) {
        solution("s");
    }   
    
    public static void solution(String s){
        int count=0;

        //----------------------------overall max count of letters in word
        // int ans=0;
        // for(int i=s.length()-1; i>=0; i--){
        //     if(s.charAt(i)!=' '){
        //         count++;
        //         if(ans<count){
        //             ans=count;
        //         }
        //         System.out.println(count);
        //     }
        //     else{
        //         count=0;
        //     }
            
        // }
        // System.out.println(ans);

        //------------------last word length

        s=s.trim();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                break;
             }
            else{
               count++;
            }
            
        }
        System.out.println(count);
    }
}
