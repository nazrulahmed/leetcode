import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(x));
    }
}
class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }else if(x<9){
            return true;
        }else{
            int temp = x;
            int reverseNum = 0;
            while(temp!=0){
                int reminder = temp%10;
                temp = temp/10;
                reverseNum = reverseNum*10+reminder;

            }
            return x==reverseNum;
        }


    }
}
