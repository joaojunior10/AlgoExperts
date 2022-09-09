public class ShiftLinkedList {
    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        // Write your code here.
        LinkedList p = head;
        int n = 1;
        while (p.next != null) {
            n++;
            p = p.next;
        }
        p.next = head;
        int x = n - k % n;
        for (int i = 0; i <= x; i++) {
            if (i == x) {
                head = p.next;
                p.next = null;
            }
            p = p.next;
        }
        return head;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}
