//For a given input array of numbers, find the two that result in the
//largest product. The output should include the two numbers in the
//array along with their product.
//

import java.util.*;
class Maximizer {
    public static void findMaxProduct(int[] nums) {
        int findMaxProduct = Integer.MIN_VALUE;
        int maxI = -1;
        int maxJ = -1;

        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (findMaxProduct < nums[i] * nums[j])
                {
                    findMaxProduct = nums[i] * nums[j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.print("Pair is (" + nums[maxI] + ", " + nums[maxJ] + "), Maximum Product: " + (nums[maxI]*nums[maxJ]));
    }

    public static void main (String[] args) {
        int[] nums = { 2, 3, 5, 7, -7, 5, 8, -5 };
        System.out.println("\nOriginal array: "+Arrays.toString(nums));
        findMaxProduct(nums);
    }
}