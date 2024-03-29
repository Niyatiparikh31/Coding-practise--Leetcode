/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode even = head;
        ListNode odd = head.next;
        ListNode temp = odd;
        while(even.next!=null && odd.next!=null)
        {
            even.next = even.next.next;
            even = even.next;
            odd.next = odd.next.next;
            odd = odd.next;
        }
        even.next=temp;
        return head;
    }
    
}