package Day6_LinkedList;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {

    /*
        Method 1 : Hashing
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> st=new HashSet<>();
        while(headA != null) {
            st.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(st.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    /*
        Method 2 : Difference in length
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int len1 = 0, len2 = 0;

        // Calculate length of list 1
        ListNode tempA = headA;
        while (tempA != null) {
            ++len1;
            tempA = tempA.next;
        }

        // Calculate length of list 2
        ListNode tempB = headB;
        while (tempB != null) {
            ++len2;
            tempB = tempB.next;
        }

        // Reset pointers to the beginning of the lists
        tempA = headA;
        tempB = headB;

        // Calculate the length difference
        int diff = len1 - len2;

        // Adjust the starting point of the longer list
        if (diff < 0) {
            while (diff++ != 0) {
                tempB = tempB.next;
            }
        } else {
            while (diff-- != 0) {
                tempA = tempA.next;
            }
        }

        // Iterate through both lists until the intersection point is found
        while (tempA != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // If no intersection is found, return null
        return null;
    }

    /*
        Method 3 : Optimised - Two Pointer using Difference in length concept
        The idea is to traverse both linked lists simultaneously, advancing each pointer by
         one node at a time until either they meet at the intersection point or both reach
          the end of their respective lists.
     */
    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2) {
            temp1 = (temp1 == null) ? headB : temp1.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }
        return temp1;
    }
}
