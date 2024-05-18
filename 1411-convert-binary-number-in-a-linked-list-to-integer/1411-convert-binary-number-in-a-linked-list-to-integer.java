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
class Solution 
{
    public int getDecimalValue(ListNode head) 
    {
        ListNode mover = head;
        int num = 0;  // Decimal value to be returned
        int size = 0; // Size of the linked list

        while(mover != null)
        {
            size++;
            mover = mover.next;
        }

        ListNode temp_node = head;

        for(int i = size-1;i >= 0;i--)
        {
            num += (temp_node.val)*(int)Math.pow(2,i); 
/* Binary to Decimal conversion (digit by digit) */
            temp_node = temp_node.next;
        }

        return num;
    }
}