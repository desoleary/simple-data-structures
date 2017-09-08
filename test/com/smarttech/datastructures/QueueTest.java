package com.smarttech.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void testQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(Arrays.asList(5, 6, 7, 3, 1));

        assertEquals((int)queue.dequeue(), 5);
        assertEquals((int)queue.dequeue(), 6);
        assertEquals((int)queue.dequeue(), 7);
        assertEquals((int)queue.dequeue(), 3);
        assertEquals((int)queue.dequeue(), 1);
        assertFalse(queue.hasItems());

    }
}