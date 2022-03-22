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
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}


/* 

Link:- (https://leetcode.com/problems/middle-of-the-linked-list/discuss/1292679/Java-100-or-Two-pointer-approach-or-Explained)

First Approach: Using Two Passes | Brute-Force Approach

1. Iterate over the whole linked list and find the length of the linked list, say N.
2. Then, iterate till N/2+1 in case of odd number of nodes and N/2 in case of even number of nodes.
    In this case Time Complexity will be O(N) and Space Complexity will be O(1).

    public ListNode middleNode(ListNode head) {
        int size=0;
        ListNode current=head;
        while(current!=null){
            current=current.next;
            size++;
        }

        current=head;
        if(size%2==0){
            for(int i=1;i<=size/2;i++){
                current = current.next; 
            }
        }else{
            for(int i=1;i<size/2+1;i++){
                current = current.next; 
            }
        }
        return current;
    }

___________________________________________________________________________

Alternative Approach: Using Extra Space

Iterate over the whole linked list and store the data in an ArrayList.
Then find the element by accessing the N/2 index of the ArrayList.
In this case Time Complexity and Space Complexity will be O(N).
___________________________________________________________________________
Second Approach: Using Two pointers

Let's think of a scenario where you have a field 200m long and there are two people, 
A is running with 1x speed and B is running with 2x, so at any given point A will be 
at half of what B has reached.

Say both starts at 0m, when Person B reaches 50m then Person A will be at 25m. 
When Person B reaches 100m then Person A will be at 50m.

After sometime If Person B reaches 200m then Person A will be at 100m.
Hence Person A is at mid of the field, when B reaches the end.

In order to solve this problem, we are going to use Two pointers, 
one pointer which moves with 1x speed and another one with 2x speed.

In this case Time Complexity will be O(N) and Space Complexity will be O(1).

*/
