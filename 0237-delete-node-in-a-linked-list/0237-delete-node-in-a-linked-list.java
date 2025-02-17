/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int num;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    
        if(node != null){
         node.val = node.next.val;
         node.next=node.next.next;
         return;
            
            
        }
    }
}