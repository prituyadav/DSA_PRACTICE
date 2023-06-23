public static void main(int n) {
     for(int i=1; i<n+1; i++){
            for(int j=0; j<n; j++){
                if(j<(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("#");
                }
            }
             System.out.println();
        }
        

    }
