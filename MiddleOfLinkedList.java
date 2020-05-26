
class MoveZeros {
    /*
    Easy.
    Given a non-empty, singly linked list with head node head, return a middle
    node of linked list.
    If there are two middle nodes, return the second middle node.
    */
    /*
    * Definition for singly-linked list.
    * public class ListNode {
    *     int val;
    *     ListNode next;
    *     ListNode() {}
    *     ListNode(int val) { this.val = val; }
    *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    * }
    */
    public ListNode middleNode(ListNode head) {
        int counter = 1;
        ListNode middle = head;
        while (head != null) {
            if (counter % 2 == 0) {
                middle = middle.next;
            }
            head = head.next;
            counter++;
        }
        return middle;
    }
}
