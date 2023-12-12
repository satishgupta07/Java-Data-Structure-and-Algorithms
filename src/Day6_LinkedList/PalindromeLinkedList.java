package Day6_LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;
        ListNode dummy = head;

        while(slow!=null) {
            if(dummy.val != slow.val) {
                return false;
            }
            dummy = dummy.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode curr) {
        ListNode pre=null;
        ListNode nxt=null;
        while(curr!=null) {
            nxt = curr.next;
            curr.next = pre;
            pre=curr;
            curr=nxt;
        }
        return pre;
    }
}
