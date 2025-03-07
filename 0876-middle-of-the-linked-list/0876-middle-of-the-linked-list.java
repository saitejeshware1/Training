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
        ListNode currNode=head;
        int count =0;
        while(currNode!=null){
            count++;
            currNode=currNode.next;
        }
            count=(count/2)+1;
            ListNode current =head;
       for(int i=1;i<count;i++){
         current=current.next;
       }
      return current;
    }
}