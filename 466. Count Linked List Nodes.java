Count how many nodes in a linked list.

Have you met this question in a real interview?  
Example
Example 1:
	Input:  1->3->5->null
	Output: 3
	
	Explanation: 
	return the length of the list.
  
  
  /**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        int cnt = 0;
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + "->");
            cnt ++;
            p = p.next;
        }
        System.out.print("null");
        return cnt;
    }
}
