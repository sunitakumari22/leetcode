// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; 
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the list of numbers (separated by spaces): ");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);

        System.out.println("The indices of the two numbers are: [" + result[0] + ", " + result[1] + "]");
    }
}
