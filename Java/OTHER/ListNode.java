package Java.OTHER;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        val = 0;
        next = null;
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
