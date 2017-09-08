package com.smarttech.datastructures;

import java.util.LinkedList;
import java.util.List;

public class Stack<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void push(E item) {
        list.addFirst(item);
    }

    public E pop() {
        return list.pop(); // removes newest item from list
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public void push(List<E> items) {
        for (E item : items) {
            push(item);
        }
    }
}
