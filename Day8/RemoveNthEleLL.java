/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = new ListNode();
        slow.next = head;
        ListNode res = slow;
        ListNode fast = head;
            
        for(int i=1; i<n; i++) {
            fast = fast.next;
        }
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return res.next;
        
        
        
    }
}



// use 2 pointers 
// slow and fast
// fast will iterate till nth ele
// and then move both slow and fast by one until fast reach null
// then slow.next = slow.next.next
