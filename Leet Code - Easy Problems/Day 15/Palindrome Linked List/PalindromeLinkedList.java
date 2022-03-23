public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow = reverse(slow);
        fast=head;
        
        while(fast != null && slow != null){
            if(fast.val != slow.val){
                return false;
            }else{
                fast=fast.next;
                slow=slow.next;
            }
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next1 = null;
        while(current != null){
            next1 = current.next;
            current.next = prev;
            prev = current;
            current = next1;
        }
        return prev;
    }
}

/**
 * 
 * Link:- (https://leetcode.com/problems/palindrome-linked-list/discuss/64501/Java-easy-to-understand)
 */