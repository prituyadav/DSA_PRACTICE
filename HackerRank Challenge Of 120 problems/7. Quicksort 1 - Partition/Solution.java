// Brute-Force Approach:
// The brute-force approach involves creating three separate arrays to store elements smaller than the pivot, equal to the pivot, and greater than the pivot. Then we concatenate these arrays and return the result.

// java
// Copy code
public class Solution {

    public static int[] quickSort(int pivot, int[] arr) {
        int[] less = new int[arr.length];
        int[] equal = new int[arr.length];
        int[] greater = new int[arr.length];

        int lessIndex = 0;
        int equalIndex = 0;
        int greaterIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                less[lessIndex++] = arr[i];
            } else if (arr[i] == pivot) {
                equal[equalIndex++] = arr[i];
            } else {
                greater[greaterIndex++] = arr[i];
            }
        }

        int[] result = new int[arr.length];
        System.arraycopy(less, 0, result, 0, lessIndex);
        System.arraycopy(equal, 0, result, lessIndex, equalIndex);
        System.arraycopy(greater, 0, result, lessIndex + equalIndex, greaterIndex);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int pivot = arr[0];
        int[] sortedArr = quickSort(pivot, arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
// Optimized Approach:
// The optimized approach uses two pointers, left and right, starting from the beginning and end of the array, respectively. We compare the elements at these pointers with the pivot and swap them if necessary. The process continues until the pointers cross each other. Finally, we place the pivot at its correct position and return the updated array.

// java
// Copy code
public class Solution {

    public static int[] quickSort(int pivot, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        int pivotIndex = left;

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < pivotIndex) {
                result[index++] = arr[i];
            } else if (i == pivotIndex) {
                result[index++] = pivot;
            } else {
                result[index++] = arr[i];
            }
        }

        return result;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int pivot = arr[0];
        int[] sortedArr = quickSort(pivot, arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
// Both approaches will produce the same result, but the optimized approach eliminates the need for creating additional arrays and reduces the number of swaps, making it more efficient.
