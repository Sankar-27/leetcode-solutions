// Last updated: 29/05/2026, 11:58:49
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        ListNode c1=heada,c2=headb;
        while(true){
            if(c1==null && c2==null){
                break;
            }
            if(c1==null)
                c1=headb;
            if(c2==null)
                c2=heada;
                
            if(c1==c2)
                return c1;
            c1=c1.next;
            c2=c2.next;      
        }
        return c1;
    }
}