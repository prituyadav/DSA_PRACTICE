
import java.util.*;

public class Main {
		
	    public static void main(String[] args){
	    	
	    	
	    	
	    	
//	    	System.out.println(5/2);
//	    	
//	    	System.out.println(5%2);
	 	
	    	System.out.println("Enter tc");
	        Scanner input=new Scanner(System.in);
	        int tc=input.nextInt();
	        
	        System.out.println(tc);
	        
	        for(int i=0; i<tc; i++){
	            int num=input.nextInt();
	           System.out.println(num);
	           
	           System.out.println(binaryByRecursion(1024));
	        };
	    }
	    
    public static int binaryByRecursion(int num){
	        if(num==0){
	            return 0;
	        }	        
	        else{
	                return (num%2+10*(binaryByRecursion(num/2)));
	        }
	    }
	

}
