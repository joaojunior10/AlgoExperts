// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShiftLinkedListTest {
    public List<Integer> linkedListToArray(ShiftLinkedList.LinkedList head) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ShiftLinkedList.LinkedList current = head;
        while (current != null) {
            array.add(current.value);
            current = current.next;
        }
        return array;
    }

    @Test
    public void TestCase1() {
        var head = new ShiftLinkedList.LinkedList(0);
        head.next = new ShiftLinkedList.LinkedList(1);
        head.next.next = new ShiftLinkedList.LinkedList(2);
        head.next.next.next = new ShiftLinkedList.LinkedList(3);
        head.next.next.next.next = new ShiftLinkedList.LinkedList(4);
        head.next.next.next.next.next = new ShiftLinkedList.LinkedList(5);
        var result = ShiftLinkedList.shiftLinkedList(head, -2);
        var array = this.linkedListToArray(result);
        System.out.println(array);
        var expected = new int[]{2, 3, 4, 5, 0, 1};
        assertArrayEquals(array.stream().mapToInt(Integer::intValue).toArray(), expected);

    }
}
