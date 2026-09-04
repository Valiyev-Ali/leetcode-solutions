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
    ListNode next;
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        next = current.next;
        current.next = null;
        return recurReverse(next, current);
    }
    public ListNode recurReverse(ListNode cur, ListNode prev) {
        if (cur == null) {
            return prev;
        }
        if (cur.next == null) {
            cur.next = prev;
            return cur;
        }
        next = cur.next;
        cur.next = prev;
        return recurReverse(next, cur);
    }

}