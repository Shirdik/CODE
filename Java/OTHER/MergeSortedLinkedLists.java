package Java;

public class MergeSortedLinkedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode head = list1;

        while (list1.next != null || list2.next != null) {
            if (list1.val == list2.val || list1.next.val >= list2.val) {
                ListNode temp = list2.next;
                list2.next = list1.next;
                list1.next = list2;
                list2 = temp;
            } else
                list1 = list1.next;

        }
        if (list1.next == null)
            list1.next = list2;
        return head;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {

    }
}
