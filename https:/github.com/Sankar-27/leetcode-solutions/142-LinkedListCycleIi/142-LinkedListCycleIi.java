// Last updated: 29/05/2026, 11:59:06
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Set<ListNode> k = new HashSet<>();
        // while (head != null) {
        //      if (k.contains(head))
        //         return head;
        //     k.add(head);
        //     head = head.next;
        // }
        // return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
            return null;
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return slow;
    }
}