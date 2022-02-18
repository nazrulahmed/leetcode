import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    /*
                                 Solution Approach:
       Here I am tried to solve this problem with two approach.
       Approach 1: Bruteforce {O(n^2)}
       Approach 2: Using HashMap {O(n)}

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SolutionBruteforce solutionBruteforce = new SolutionBruteforce();
        SolutionHashMap solutionHashMap = new SolutionHashMap();
        int n; //number of items
        int[] nums = new int[10005]; //numbers
        int[] resultArray = new int[10005];
        int target;
        System.out.println("Enter Number of items");
        n = scanner.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target");
        target = scanner.nextInt();

        System.out.println("Select the solution type: ");
        System.out.println("1. Bruteforce");
        System.out.println("2. HashMap");
        int type = scanner.nextInt();
        if (type==1)
            resultArray = solutionBruteforce.twoSum(nums,target);
        else if (type==2)
            resultArray = solutionHashMap.twoSum(nums,target);
        else
            System.out.println("Invalid choice. Rerun the program and try again :p");

        System.out.println(Arrays.toString(resultArray));
    }

}

class SolutionBruteforce {

    /*
                                Solution Approach:
      Here I am trying to solve this problem with bruteforce approach.
      For each item I am trying to add with current item rest items one by one and checking if the addition is equal to target number.

    */
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

class SolutionHashMap{
    /*
                             Solution Approach:
   Here I am trying to solve this problem using hashmap.
   For each I am calculating the required number to meet the target, and storing this the required number
   correspond to the current index. that means if I found a case found where the item is already in my required number list I will directly pick the index for which it is required.
 */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>numberMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int requiredNumber = target-nums[i];
            if(numberMap.containsKey(requiredNumber)){
                return  new int[]{numberMap.get(requiredNumber),i};
            }
            numberMap.put(nums[i],i);
        }
        return null;
    }
}