package Day5_LinkedList;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode node = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null) node.next = list1;
        if (list2 != null) node.next = list2;

        return head.next;
    }

    /* In-place merge sort */
    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        // when list1 is empty then our output will be same as list2
        if (list1 == null)
            return list2;

        // when list2 is empty then our output will be same as list1
        if (list2 == null)
            return list1;

        // pointing l1 and l2 to the smallest and greatest one
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        // act as the head of the resultant merged list
        ListNode res = list1;

        while (list1 != null && list2 != null) {
            ListNode temp = null;

            while (list1 != null && list1.val <= list2.val) {
                temp = list1; // storing the last sorted node
                list1 = list1.next;
            }

            // link the previous sorted node with the next larger node in list2
            temp.next = list2;

            // swap l1 and l2
            ListNode swapTemp = list1;
            list1 = list2;
            list2 = swapTemp;
        }

        return res;
    }
}
