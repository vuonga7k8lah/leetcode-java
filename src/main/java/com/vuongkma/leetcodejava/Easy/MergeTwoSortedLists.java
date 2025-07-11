package com.vuongkma.leetcodejava.Easy;

import com.vuongkma.leetcodejava.BoilerplateInterface;

public class MergeTwoSortedLists implements BoilerplateInterface {
    @Override
    public void descriptionProblem() {
//        You are given the heads of two sorted linked lists list1 and list2.
//
//                Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//                Return the head of the merged linked list.
//
//
//
//                Example 1:
//
//
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//        Example 2:
//
//        Input: list1 = [], list2 = []
//        Output: []
//        Example 3:
//
//        Input: list1 = [], list2 = [0]
//        Output: [0]
    }

    @Override
    public void run() {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Tạo node giả để dễ nối.
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Duyệt cho đến khi 1 list hết.
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Di chuyển tail.
        }

        // Nếu 1 list vẫn còn phần tử, nối hết vào.
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // Trả về đầu danh sách mới (bỏ node giả).
        return dummy.next;
    }

}
