package com.smarttech.datastructures;

import java.util.LinkedList;
import java.util.List;

public class Queue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E item) {
        list.addLast(item);
    }

    public E dequeue() {
        return list.poll(); // removes oldest item from list
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public void enqueue(List<E> items) {
        for (E item : items) {
            enqueue(item);
        }
    }
}
