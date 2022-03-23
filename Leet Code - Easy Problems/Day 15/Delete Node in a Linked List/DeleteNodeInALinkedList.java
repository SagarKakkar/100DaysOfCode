public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        //1->2->3->4
        //this algorithm actually yields 2->3->4. By using "node.next = node.next.next", 
        //your "2" should be point to the second "3" now. You don't have reference to the 
        //first "3" any more.
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
