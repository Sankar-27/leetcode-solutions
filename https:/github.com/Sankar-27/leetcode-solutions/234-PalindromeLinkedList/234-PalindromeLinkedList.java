// Last updated: 29/05/2026, 11:58:07
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec=reverse(slow);
        ListNode start=head;
        ListNode end=sec;
        while(end!=null){
            if(start.val != end.val)
                return false;
            start=start.next;
            end=end.next; 
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}