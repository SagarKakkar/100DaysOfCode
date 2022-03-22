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
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // Recursive Approach | Time Complexity - O(N), Space Complexity - O(N)
        if(head == null || head.next == null){
            return head;
        }
        ListNode reverseListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseListHead;
    }
}

/**
 * 
 * Link:- (https://leetcode.com/problems/reverse-linked-list/discuss/58125/In-place-iterative-and-recursive-Java-solution)
 * 
 * 1. Iterative Approach | Time Complexity - O(N), Space Complexity - O(1)
 * 
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
 * 
 */