样例
Example 1:

Input: number = 123
Output: 321
Example 2:

Input: number = 900
Output: 9
注意事项
You may assume the given number is larger or equal to 100 but smaller than 1000.

public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int a = number / 10 / 10;
        int b = number / 10 % 10;
        int c = number % 10 ;
        int sum = c * 100 + b * 10 + a ;
        return sum;
        
    }
}
