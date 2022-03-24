public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB==null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        //if a & b have different len, then we will stop the loop after second iteration
        while(a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null ? headA : a.next;
            b = b == null ? headB : b.next;
        }
        return a;
    }    
}

/**
 * 
 * Link:- (https://www.youtube.com/watch?v=gE0GopCq378)
 * Link:- (https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!)
 * 
 * 1. Brute-Force Approach | O(mn)
 * Runtime: 824 ms, faster than 5.08% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 45.3 MB, less than 84.69% of Java online submissions for Intersection of Two Linked Lists.
 * 
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int m = listLength(headA); // m
            int n = listLength(headB); // n
            ListNode temp=headB;
            for(int i=0;i<m;i++){ // mn
                headB=temp;
                for(int j=0;j<n;j++){
                    if(headA==headB){
                        return headA;
                    }
                    headB=headB.next;
                }
                headA=headA.next;
            }
            return null;
        }
        
        public int listLength(ListNode head){
            ListNode current =head;
            int size=0;
            while(current!=null){
                current=current.next;
                size++;
            }
            return size;
        }
 * 
 * 
 * 2. Using Memory(Extra-Space) to optimize Brute-Force | O(m log m + n log n)
 * Runtime: 10 ms, faster than 19.25% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 55.1 MB, less than 55.03% of Java online submissions for Intersection of Two Linked Lists.
 * 
         public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            Set<ListNode> linkSet = new HashSet<>();
            while(headB != null){           // O(n log n)
                linkSet.add(headB);
                headB=headB.next;
            }
            while(headA!=null){           // O(m log m)
                if(linkSet.contains(headA)){
                    return headA;
                }
                headA=headA.next;
            }
            return null;
        }
 * 
 * 3. Optimized | O(m + n)
 * Runtime: 2 ms, faster than 53.30% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 56.3 MB, less than 7.08% of Java online submissions for Intersection of Two Linked Lists.
 * 
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int m = listLength(headA); // O(m)
            int n = listLength(headB); // O(n)
            int d = n-m;
            if(m > n){  // Swap the two linked lists head pointer || O(1)
                ListNode temp=headA;
                headA=headB;
                headB=temp;
                d=m-n;
            }

            // O(m + n)
            for(int i=0;i<d;i++){
                headB=headB.next;
            }
            
            while(headA!=null || headB != null){
                if(headA == headB){
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
            }
            
            return null;
        }
        
        public int listLength(ListNode head){
            ListNode current =head;
            int size=0;
            while(current!=null){
                current=current.next;
                size++;
            }
            return size;
        }
 * 
 */
