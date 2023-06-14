// Brute Force Solution (Java):

// Here's a brute force solution to calculate the number of times Maria breaks her records for the most and least points scored during the season:

// java

public class Main {
    public static int[] breakingRecords(int[] scores) {
        int minCount = 0;
        int maxCount = 0;
        int minScore = scores[0];
        int maxScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
                minCount++;
            } else if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxCount++;
            }
        }

        return new int[]{maxCount, minCount};
    }

    public static void main(String[] args) {
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] recordCounts = breakingRecords(scores);
        System.out.println(recordCounts[0] + " " + recordCounts[1]);
    }
}
// In the brute force solution, the breakingRecords function takes an array of scores as input. It initializes variables minCount and maxCount to keep track of the number of times Maria breaks her records for the least and most points, respectively. It also initializes minScore and maxScore with the first element of the scores array.

// Then, it iterates through the remaining elements of the scores array. If a score is less than the current minimum score (minScore), Maria has broken her record for the least points, so minCount is incremented and minScore is updated. If a score is greater than the current maximum score (maxScore), Maria has broken her record for the most points, so maxCount is incremented, and maxScore is updated.

// Finally, the function returns an array containing the counts of breaking the most and least points records.

// The main method creates an array of scores, calls the breakingRecords function with the array as an argument, and prints the resulting counts.

// Time Complexity: The time complexity of this solution is O(n), where n is the number of games. We iterate through the scores array once.

// Space Complexity: The space complexity is O(1) because we use a constant amount of extra space to store the counts and scores.

// Optimized Solution (Java):

// Here's an optimized solution to calculate the number of times Maria breaks her records for the most and least points scored during the season:

// java

public class Main {
    public static int[] breakingRecords(int[] scores) {
        int minCount = 0;
        int maxCount = 0;
        int minScore = scores[0];
        int maxScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
                minCount++;
            } else if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxCount++;
            }
        }

        return new int[]{maxCount, minCount};
    }

    public static void main(String[] args) {
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] recordCounts = breakingRecords(scores);
        System.out.println(recordCounts[0] + " " + recordCounts[1]);
    }
}
// The optimized solution is the same as the brute force solution in this case because we need to iterate through the entire scores array to determine the counts of breaking records. Therefore, both the time and space complexity remain the same as mentioned for the brute force solution.

// Time Complexity: O(n), where n is the number of games.
// Space Complexity: O(1)
