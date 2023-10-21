import java.util.ArrayList;
import java.util.List;

public class PascalTraingle{
    public static void main(String[] args) {
        //input 
        int num=3;
        List<Integer> ans= getRow(num);
        System.out.println(ans);

    }

     public static List<Integer> getRow(int rowIndex) {
          List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // The first and last elements in each row are 1.
                } else {
                    int prevRow = i - 1;
                    int leftVal = triangle.get(prevRow).get(j - 1);
                    int rightVal = triangle.get(prevRow).get(j);
                    row.add(leftVal + rightVal); // Sum of the two numbers above.
                }
            }
            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}