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
    public ListNode middleNode(ListNode head) {
        int middle = (getLength(head)/2);
        for(int i=0;i<middle;i++){
            head = head.next;
        }
        return new ListNode(head.val, head.next);
    }
    
    int getLength(ListNode node){
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}