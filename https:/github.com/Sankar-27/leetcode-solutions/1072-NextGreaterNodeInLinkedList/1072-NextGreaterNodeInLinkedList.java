// Last updated: 29/05/2026, 11:54:58
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
    public int[] nextLargerNodes(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        Stack<ListNode> st= new Stack<>();
        ListNode curr=head,x=null;
        int n=0;
        while(curr!=null){
            if(st.isEmpty())
                st.push(curr);
            else{
                while(!st.isEmpty() && curr.val>st.peek().val){
                    x=st.pop();
                    map.put(x,curr.val);
                }
                st.push(curr);
                curr=curr.next;
                n++;
            }    
        }
        while(!st.isEmpty()){
            map.put(st.pop(),0);
        }
        int[] ans=new int[n];
        curr=head;
        int i=0;
        while(curr!=null){
            ans[i]=map.get(curr);
            curr=curr.next;
            i++;
        }
        return ans; 
    }
}