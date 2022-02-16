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
    public ListNode swapPairs(ListNode head) {
        // 1->2->3->4->null
        if(head==null||head.next==null) return head; // If head is null or head's next is null then return head. For example 1. if head=[], then return []. 2. if head=[1], then return [1].
        ListNode n=head.next; // Initialize a ListNode 'n' which has the pointer to the head's next. 1->2
        head.next=swapPairs(head.next.next); // Put the head.next equal to the node given by swapPairs function with head.next.next as the argument. 4->3
        n.next=head; // Put the pointer of n's next equal to the head. 2->1
        return n; // Finally return 'n'.
    }
}
