package cn.fatedeity.algorithm.leetcode;

/**
 * 两数相加
 */
public class AddTwoNumbers {
    public ListNode answer(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode listNode = result;
        boolean addOne = false;
        while (l1 != null || l2 != null || addOne) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (addOne) {
                sum += 1;
            }
            addOne = sum >= 10;
            listNode.next = new ListNode(sum % 10);
            listNode = listNode.next;
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
