public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode current = head;
        while(current !=null && current.next != null){
            if(current.next.val == val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
}

/**
 * 
 * Link :- (https://leetcode.com/problems/remove-linked-list-elements/discuss/1572932/Java-Three-Simple-and-Clean-solutions-w-Explanation-or-Iterative-and-Recursive-or-Beats-100)
 * 
 *  Dummy-Pointer Approach
 * 
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        
        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return dummy.next;
    }
 * 
 */
