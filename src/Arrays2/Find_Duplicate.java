package Arrays2;

import java.util.*;

public class Find_Duplicate {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point in the cycle
        do {
            slow = nums[slow];          // Move slow pointer by 1 step
            fast = nums[nums[fast]];    // Move fast pointer by 2 steps
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle (duplicate number)
        fast = nums[0];  // Start the fast pointer at the beginning
        while (slow != fast) {
            slow = nums[slow];  // Move both pointers by 1 step
            fast = nums[fast];
        }

        return slow; // Both pointers meet at the duplicate number
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 4, 2, 3};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}
