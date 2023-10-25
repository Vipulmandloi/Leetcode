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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode n=new ListNode(0);int c=0;
        ListNode dummy=n;
        while(a!=null||b!=null){
            
            int x=a!=null?a.val:0;
            int y=b!=null?b.val:0;
            int k=x+y+c;
            c=k/10;
            dummy.next=new ListNode(k%10);
            dummy=dummy.next;
            if(a!=null)
                a=a.next;
            if(b!=null)
                b=b.next;
        }
        if(c>0){
            dummy.next=new ListNode(c);
        }
        return n.next;
    }
}