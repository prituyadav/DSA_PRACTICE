public static int sockMerchantOptimized(int n, int[] ar) {
    int count = 0;
    Map<Integer, Integer> colorCount = new HashMap<>();

    for (int i = 0; i < n; i++) {
        int color = ar[i];
        colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
    }

    for (int countPerColor : colorCount.values()) {
        count += countPerColor / 2;
    }

    return count;
}

// The optimized approach utilizes a hash set or a hash map to keep track of the count of each color. By counting the occurrences of each color, you can determine the number of pairs.


// Both approaches will give you the same result, but the optimized approach has a better time complexity of O(n) due to the use of a hash map. The brute force approach has a time complexity of O(n^2) because of the nested loops.
  
