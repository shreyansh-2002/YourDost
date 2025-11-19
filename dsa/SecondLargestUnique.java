import java.util.*;

public class SecondLargestUnique {

    /**
     * APPROACH:
     * 1. We Use HashSet to remove duplicates.
     * 2. If unique numbers < 2 → return -1.
     * 3. Find largest & second largest in one pass (O(n)).
     */
    public static int findSecondLargest(int[] arr) {
        // Step 1: Unique numbers
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Not enough unique values
        if (set.size() < 2)
            return -1;

        // Step 3: Find largest & second largest
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : set) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    // Sample Test Cases
    public static void main(String[] args) {

        int[] arr1 = { 3, 5, 2, 5, 6, 6, 1 };
        System.out.println("Input: [3, 5, 2, 5, 6, 6, 1]");
        System.out.println("Output: " + findSecondLargest(arr1)); // 5

        int[] arr2 = { 7, 7, 7 };
        System.out.println("\nInput: [7, 7, 7]");
        System.out.println("Output: " + findSecondLargest(arr2)); // -1
    }
}


