package Java.EASY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Java.OTHER.ListNode;

public class PalindromeLinkedList {
    public static boolean isPalindrome1(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        // slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static boolean isPalindrome(ListNode head) {

        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        r.addAll(l);
        Collections.reverse(r);
        return l.equals(r);
    }

    public static void main(String[] args) {

        ListNode y = new ListNode(2);
        ListNode x = new ListNode(1, y);
        System.out.println(isPalindrome(x));

    }
}
