package Perform_merging;

import java.util.Arrays;
// import java.util.Scanner;

/*
Perform Merging Ended
Description

You are given two sorted arrays each of length N. Your task is to write a program that merges both the arrays such that the final array formed after merging is sorted.

Note: You must not use sort() function in your entire code


Input
Input Format :

First line contains N which is the number of integers present in both the arrays.

Second line contains N sorted integers which are elements of first array.

Third line contains N sorted integers which are elements of second array.



Constraints :

N < 1000


Output
Output the array formed after merging elements such that it is sorted


Sample Input 1 

4
1 5 7 9
2 4 6 8
Sample Output 1

1 2 4 5 6 7 8 9
*/

public class Main {

	public static void main(String[] args) {
		//Scanner c=new Scanner(System.in);
		int n=4;
		int[] arr1= {1,5,7,9};
		int[] arr2= {2,4,6,8};
		
		int[] arr=performMerging(arr1,arr2,n);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] performMerging(int[] arr1,int[] arr2, int n) {
//		int s1=0;
//		int s2=0;
//		int[] ans=new int[8];
//		int j=0;
//		
//		  while(s1<n || s2<n){
//		      if(arr1[s1]<arr2[s2]){
//		          
//		          ans[j]=arr1[s1];
//		          j++;
//		          s1++;
//		      }
//		      else if(arr1[s1]>arr2[s2]){
//		           ans[j]=arr2[s2];
//		           j++;
//		          s2++;
//		      }
//		      else{
//		          if(s1<n){
//		        	  ans[j]=arr1[s1];
//		               s1++;
//		               j++;
//		          }
//		        else{
//		        	ans[j]=arr2[s2];
//		           j++;
//		          s2++;
//		        }
//		      }  
//		
//		
//		  }
//		
     	//return ans;
		  int[] ans2= {1,2,3,4,5,6,7,8};
		  return ans2;
	}

}




























