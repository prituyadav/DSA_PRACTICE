import java.util.*;



public class RotateImage {

    public static void main(String[] args){
        //call your method here
    }

public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                st.push(matrix[i][j]);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int x=st.pop();
                matrix[j][i]=x;
            }
        }
        
    }
}
