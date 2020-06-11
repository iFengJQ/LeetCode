/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        // 引入头节点，方便操作
        dummy.next = head;

        ListNode before = dummy;
        ListNode behind = dummy;

        // 前指针先行 n 个节点
        for (int i = 0; i < n; i++) {
            before = before.next;
        }


        // 移动前指针和后指针，直到前指针到达最后一个节点
        while (before.next != null) {
            before = before.next;
            behind = behind.next;
        }

        // 删除链表倒数第 n 个节点
        ListNode temp = behind.next;
        behind.next = temp.next;
        temp.next = null;

        return dummy.next;
    }
}
// @lc code=end
