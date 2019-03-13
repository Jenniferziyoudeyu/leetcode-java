package q1_10;

import public_class.ListNode;

public class Q2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(l1.val + l2.val);
        while(l1 != null && l2 != null) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return res;
    }

}
