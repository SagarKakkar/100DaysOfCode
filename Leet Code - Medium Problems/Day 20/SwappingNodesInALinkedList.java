public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first, second;
        ListNode slow=head;
        ListNode fast=head;
        
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        
        first = fast;
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        second = slow;
        
        int temp = first.val;
        first.val=second.val;
        second.val=temp;
        
        return head;
    }
}




/**
 *
 * Link:- (https://leetcode.com/problems/swapping-nodes-in-a-linked-list/discuss/1009918/Java-or-Two-Pointers-or-Detailed-Explanation-or-O(n)-time-O(1)-space)
 * Link:- (https://leetcode.com/problems/swapping-nodes-in-a-linked-list/discuss/1912231/Java-3-Approaches%3A-Swapping-Nodes-with-Image-Explaination-or-Code-Commented)
 * 
 * 
 * Brtue-Force Approach | O(N), O(N)
 * 
 *  public ListNode swapNodes(ListNode head, int k) {
        ListNode current = head;
        int[] arr = new int[100000];
        int size=0;
        while(current != null){
            arr[size++]=current.val;
            current = current.next;
        }
        
        int counter=1;
        for(int j=0,h=size-1;j<=k;j++,h--){
            if(counter==k){
                int temp = arr[j];
                arr[j]=arr[h];
                arr[h]=temp;
            }
            counter++;
        }
        
        ListNode current2 = head;
        int x=0;
        while(current2 !=null){
            current2.val=arr[x];
            current2 = current2.next;
            x++;
        }
        return head;
    }
*/