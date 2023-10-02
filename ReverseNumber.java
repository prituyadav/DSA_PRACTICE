
public class ReverseNumber {

	public static void main(String[] args) {
		int num=123;
		int reverse=0;
//		for(int i=0; i<3; i++) {   //for this first you have to find the length of digit by converting string 
		                           //using loop.but in while loop this problem is not...
//		  int x=num%10;
//		   reverse=reverse*10+x;
//		   num=num-x;
//		   num=num/10;
//			
//		}
		
		while(num>0) {
			reverse=reverse*10+num%10;
			num=num-num%10;
			num=num/10;
		}
      System.out.println(reverse);
	}

}
