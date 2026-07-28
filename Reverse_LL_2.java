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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null && left == right) return head;

        ListNode dumy = new ListNode(0);
        dumy.next=head;
        ListNode pre = dumy;

        for(int i=0;i< left-1;i++){
            pre = pre.next;

          
        }
         ListNode curr = pre.next;

        for(int i=0;i< right-left ; i++){
            ListNode forw = curr.next;
            curr.next = forw.next;
            forw.next= pre.next;
            pre.next = forw;
        }
        return dumy.next;
    }
}
