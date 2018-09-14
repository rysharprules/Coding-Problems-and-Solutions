
public class Solution {

    /*
        See similar problem: 287: Find the Duplicate Number
     */
    public ListNode detectCycle(ListNode head) {
        // two pointers, both start at head
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) { // if null, there is no cycle
            // fast is twice as fast as slow
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) { // we found a match
                ListNode slow2 = head; // another slow, starting at head
                while (slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null; // no cycle
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}