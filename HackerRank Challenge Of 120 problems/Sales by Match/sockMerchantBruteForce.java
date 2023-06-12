// Brute Force Approach:
// The brute force approach involves checking each pair of socks and counting the number of pairs with matching colors.

// java code
public static int sockMerchantBruteForce(int n, int[] ar) {
    int count = 0;
    boolean[] visited = new boolean[n]; // to keep track of visited socks

    for (int i = 0; i < n; i++) {
        if (visited[i]) {
            continue; // skip if the sock is already paired
        }

        int pairCount = 1; // count the current sock as a pair

        for (int j = i + 1; j < n; j++) {
            if (ar[i] == ar[j] && !visited[j]) {
                visited[j] = true; // mark the sock as visited
                pairCount++;
                break; // found a pair, break the inner loop
            }
        }

        count += pairCount / 2; // add the number of pairs to the count
    }

    return count;
}
