// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RiverSizesTest {
    @Test
    public void TestCase1() {
        int[][] input = {
                {1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0},
                {0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1}
        };
        int[] expected = {2, 1, 21, 5, 2, 1};
        List<Integer> output = RiverSizes.riverSizes(input);
        System.out.println(output);
        assertArrayEquals(output.stream().mapToInt(Integer::intValue).toArray(), expected);
    }
}
