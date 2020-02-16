Convert a lowercase character to uppercase.

样例
Example 1:

Input: 'a'
Output: 'A'
Example 2:

Input: 'b'
Output: 'B'

public class Solution {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        character -= 32;
        return character;
    }
}
 
