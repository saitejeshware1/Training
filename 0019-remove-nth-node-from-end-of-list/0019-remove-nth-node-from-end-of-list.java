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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode res = new ListNode(0);
        res.next = head;
        ListNode first = res;
        ListNode second = res;

        for(int i = 0;i<=n;i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next; 
        }

        second.next = second.next.next;

        return res.next;

        
    }
}