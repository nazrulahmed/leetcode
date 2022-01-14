import java.util.Scanner;

public class TwoSum {
    /*
                                 Solution Approach:
       Here I am trying to solve this problem with bruteforce approach.
       For each item I am trying to add with current item rest items one by one and checking if the addition is equal to target number.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int n; //number of items
        int[] nums = new int[10005]; //numbers
        int target;
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        target = scanner.nextInt();
        solution.twoSum(nums,target);
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++){ // as the last item can't be checked with (last item+1), so we will go till size-1;
            for (int j=i+1; j<nums.length;j++){
                if (nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return null;
    }
}