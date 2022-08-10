package main.problems;

/***********************************************************************************************************************

    Given an integer x, return true if x is palindrome integer.

    An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.


    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


    Constraints:

    -231 <= x <= 231 - 1


    Follow up: Could you solve it without converting the integer to a string?

 **********************************************************************************************************************/

public class Palindrome {

    public static boolean isPalindrome(int x) {
        char[] input = String.valueOf(x).toCharArray();
        int fwdPosition = 0;
        int bcwPosition = input.length - 1;
        while (fwdPosition <= bcwPosition) {
            if (input[fwdPosition] != input[bcwPosition]) {
                return false;
            }
            fwdPosition++;
            bcwPosition--;
        }
        return true;
    }

    public static boolean isPalindromeNotTransformed(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x = x/10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static int reversedNumber(int x) {
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed;
    }

}
