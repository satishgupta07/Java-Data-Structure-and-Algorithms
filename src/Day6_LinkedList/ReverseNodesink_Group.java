package Day6_LinkedList;

public class ReverseNodesink_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length/k;

        while(count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode nxt = current.next;
            for(int i=0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = nxt;
                if(nxt != null) {
                    nxt = nxt.next;
                }
            }

            if(last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
            prev = newEnd;
            count--;
        }
        return head;
    }

    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
