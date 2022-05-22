package com.dileep.Day8;

public class MiddleEleINLL {
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
        public ListNode middleNode(ListNode head) {

            // simple iteration Method O(n) + O(n/2)
//         ListNode helperH = head;
//         int count = 0;
//         while(helperH != null) {
//             count++;
//             helperH = helperH.next;
//         }

//         for(int i=0; i<count/2; i++) {
//             head = head.next;
//         }
//         return head;

            // Tortoise method o(n/2)

            ListNode one = head;
            ListNode two = head;

            while(two != null && two.next != null ) {
                one = one.next;
                two = two.next.next;
            }
            return one;
        }
    }
}
//
//Example 2:
//
//
//        Input: head = [1,2,3,4,5,6]
//        Output: [4,5,6]
//        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.