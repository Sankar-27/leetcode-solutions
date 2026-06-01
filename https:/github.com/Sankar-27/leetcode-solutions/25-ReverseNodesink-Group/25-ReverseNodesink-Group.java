// Last updated: 01/06/2026, 12:32:15
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        if (head == null) return null;
4        ListNode temp = head;
5        int count = 0;
6        while (temp != null && count < k) {
7            temp = temp.next;
8            count++;
9        }
10        if (count < k) return head;
11        ListNode prev = null;
12        ListNode curr = head;
13        ListNode next = null;
14        count = 0;
15        while (curr != null && count < k) {
16            next = curr.next;
17            curr.next = prev;
18            prev = curr;
19            curr = next;
20            count++;
21        }
22        head.next = reverseKGroup(curr, k);
23        return prev;
24    }
25}
26