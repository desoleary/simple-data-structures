package com.smarttech.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void testQueue() {
        Stack<Integer> stack = new Stack<>();
        stack.push(Arrays.asList(5, 6, 7, 3, 1));

        assertEquals((int)stack.pop(), 1);
        assertEquals((int)stack.pop(), 3);
        assertEquals((int)stack.pop(), 7);
        assertEquals((int)stack.pop(), 6);
        assertEquals((int)stack.pop(), 5);
        assertFalse(stack.hasItems());

    }
}