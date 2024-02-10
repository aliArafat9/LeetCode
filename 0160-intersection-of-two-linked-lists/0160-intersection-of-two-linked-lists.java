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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0,c2=0;
        ListNode a=headA,b=headB;
        while(a!=null){
            c1++;
            a=a.next;
        }
        while(b!=null){
            c2++;
            b=b.next;
        }
        while(c1>c2){
            c1--;
            headA=headA.next;
        }
        while(c2>c1){
            c2--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}