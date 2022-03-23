public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            if(slow == fast.next){
                return true;
            }else{
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}

/**
 * // Extra Space Approach
 * 
    public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		HashSet<ListNode> nodeSet = new HashSet<>();
		while(head != null) {
			if (nodeSet.contains(head))
				return true;
			nodeSet.add(head);
			head = head.next;
		}
		return false;
	}
 * 
 */