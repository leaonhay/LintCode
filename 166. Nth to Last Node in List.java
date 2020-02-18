Find the nth to last element of a singly linked list. 

The minimum number of nodes in list is n.
Example 1:
	Input: list = 3->2->1->5->null, n = 2
	Output: 1


Example 2:
	Input: list  = 1->2->3->null, n = 3
	Output: 1
  
  /**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */

//两个指针
public class Solution {
    /*
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode p = head;  //测距指针
        ListNode q = head;  //尾指针
        int cnt = 0;
        if (p == null) return p;
        while(q != null){
            q = q.next;
            cnt++;
        }
        while(cnt - n > 0 ){
             p = p.next;
             cnt--;
        }
        return p;
    }
} 
