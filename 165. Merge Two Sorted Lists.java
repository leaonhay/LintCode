Merge two sorted (ascending) linked lists and return it as a new sorted list. The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.

样例
Example 1:
	Input: list1 = null, list2 = 0->3->3->null
	Output: 0->3->3->null
Example 2:
  Input:  list1 =  1->3->8->11->15->null, list2 = 2->null
  Output: 1->2->3->8->11->15->null
  
  
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
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode l = new ListNode(0); 
        l.next = null;
        ListNode p = l; //构造一个新链表的尾指针。
        while (l1 != null && l2 != null ) {
            if(l1.val <= l2.val){
            p.next = l1;
            l1 = l1.next;
        }else {
            p.next = l2;
            l2 = l2.next;
        }
        p = p.next;
    }
        if(l1 == null) p.next = l2;
        if(l2 == null) p.next = l1;
        return l.next;
    } 
}
