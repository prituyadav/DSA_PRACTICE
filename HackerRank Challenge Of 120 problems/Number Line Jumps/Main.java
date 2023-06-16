// Brute Force Solution (Java):

// Here's a brute force solution to determine if the two kangaroos can meet at the same location at the same time:
// java


public class Main {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO"; // Kangaroo 1 is not able to catch up or meet Kangaroo 2
        }
        
        while (x1 < x2) {
            x1 += v1;
            x2 += v2;
            
            if (x1 == x2) {
                return "YES"; // Kangaroos meet at the same location
            }
        }
        
        return "NO"; // Kangaroo 1 cannot catch up to Kangaroo 2
    }

    public static void main(String[] args) {
        int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
// In the brute force solution, the kangaroo function takes the starting positions (x1 and x2) and jump distances (v1 and v2) for the two kangaroos as input.

// The solution first checks if v1 is less than or equal to v2. If it is, Kangaroo 1 will never be able to catch up or meet Kangaroo 2, so we return "NO".

// Next, we use a while loop to simulate the jumps of the kangaroos. In each iteration of the loop, we update the positions of the kangaroos by adding their respective jump distances. We continue this process until Kangaroo 1 reaches a position that is equal to or greater than the position of Kangaroo 2.

// If Kangaroo 1 and Kangaroo 2 have the same position after a jump, we return "YES" indicating that they have met at the same location. If the loop completes without the kangaroos meeting, we return "NO".

// The main method sets the input values, calls the kangaroo function, and prints the result.

// Time Complexity: The time complexity of this solution is O(n), where n represents the number of jumps needed for Kangaroo 1 to catch up or surpass Kangaroo 2. In the worst case, Kangaroo 1 will need to jump a number of times equal to the difference in their starting positions (x2 - x1).

// Space Complexity: The space complexity is O(1) because we only use a constant amount of extra space to store the input variables and the result.

// Optimized Solution (Java):

// Here's an optimized solution to determine if the two kangaroos can meet at the same location at the same time:

// java

public class Main {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO"; // Kangaroo 1 is not able to catch up or meet Kangaroo 2
        }
        x2 - x1) % (v1 - v2) == 0) {
            
        if ((return "YES"; // Kangaroos meet at the same location
        }
        
        return "NO"; // Kangaroo 1 cannot catch up to Kangaroo 2
    }

    public static void main(String[] args) {
        int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
// In the optimized solution, we first perform the same check as in the brute force solution to determine if Kangaroo 1 is able to catch up or meet Kangaroo 2. If not, we return "NO".

// Instead of simulating the jumps, we directly check if the difference in starting positions (x2 - x1) is divisible by the difference in jump distances (v1 - v2). If the remainder is zero, it means that Kangaroo 1 can reach the same position as Kangaroo 2 after a certain number of jumps.

// If the condition is true, we return "YES" indicating that they have met at the same location. Otherwise, we return "NO".

// The main method sets the input values, calls the kangaroo function, and prints the result.

// Time Complexity: The time complexity of this solution is O(1), as we perform a constant number of operations regardless of the input values.

// Space Complexity: The space complexity is O(1) because we only use a constant amount of extra space to store the input variables and the result.
