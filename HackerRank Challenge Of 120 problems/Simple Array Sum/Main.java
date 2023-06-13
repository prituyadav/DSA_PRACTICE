// Brute Force Solution (Java):

// Here's a brute force solution to find the sum of elements in an array in Java:


public class Main {
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 11};
        int sum = simpleArraySum(arr);
        System.out.println(sum);
    }
}
// In the above solution, the function simpleArraySum takes an array ar as input and initializes a variable sum to 0. It then iterates over each element in the array, adding it to the sum variable. Finally, it returns the calculated sum.

// The main method creates an array [1, 2, 3, 4, 10, 11], calls the simpleArraySum function with the array as an argument, and prints the resulting sum.

// Optimized Solution (Java):

// Here's an optimized solution to find the sum of elements in an array in Java:

// java

public class Main {
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 11};
        int sum = simpleArraySum(arr);
        System.out.println(sum);
    }
}
// In the optimized solution, the for-each loop is used to iterate over each element num in the array ar. This eliminates the need to access elements using indices. The sum is calculated by adding each num to the sum variable. Finally, the calculated sum is returned.

// The main method is similar to the brute force solution, creating an array, calling the simpleArraySum function, and printing the sum.
