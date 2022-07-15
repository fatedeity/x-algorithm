package cn.fatedeity.algorithm.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers;

    private ListNode genListNode(int[] array) {
        ListNode result = new ListNode();
        ListNode listNode = result;
        for (int val : array) {
            listNode.next = new ListNode(val);
            listNode = listNode.next;
        }
        return result.next;
    }

    private void assertListNode(ListNode l1, ListNode l2, String message) {
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        while (l1 != null) {
            arrayList1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            arrayList2.add(l2.val);
            l2 = l2.next;
        }
        assertArrayEquals(
                arrayList1.toArray(),
                arrayList2.toArray(),
                message
        );
    }

    @BeforeEach
    void setUp() {
        this.addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void answer() {
        this.assertListNode(
                this.genListNode(new int[]{7, 0, 8}),
                addTwoNumbers.answer(
                        this.genListNode(new int[]{2, 4, 3}),
                        this.genListNode(new int[]{5, 6, 4})
                ),
                "题目示例 1"
        );
        this.assertListNode(
                this.genListNode(new int[]{0}),
                addTwoNumbers.answer(
                        this.genListNode(new int[]{0}),
                        this.genListNode(new int[]{0})
                ),
                "题目示例 2"
        );
        this.assertListNode(
                this.genListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1}),
                addTwoNumbers.answer(
                        this.genListNode(new int[]{9, 9, 9, 9, 9, 9, 9}),
                        this.genListNode(new int[]{9, 9, 9, 9})
                ),
                "题目示例 3"
        );

    }
}
