/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(head!=null)
        {
            head=head.next;
            curr.next=prev;
            prev=curr;
            curr=head;
        }
        return prev;
    }
}