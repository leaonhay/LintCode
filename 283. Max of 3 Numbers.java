Given 3 integers, return the max of them.

样例
Example 1:
	Input:  num1 = 1, num2 = 9, num3 = 0
	Output: 9
	
	Explanation: 
	return the Max of them.

Example 2:
	Input:  num1 = 1, num2 = 2, num3 = 3
	Output: 3
	
	Explanation: 
	return the Max of them.

public class Solution {
    /**
     * @param num1: An integer
     * @param num2: An integer
     * @param num3: An integer
     * @return: an interger
     */
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int max = (num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
        return max;
    }
}
