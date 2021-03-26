package com.education.mosbach.algorithms.structures.storageImpl;

import com.education.mosbach.algorithms.structures.storage.Storage;

/**
 * Take care! Stack can only hold 50 or less elements.
 */
public class ArrayStackStorageImpl implements Storage {

    // topPosition -1: no elements stored
    // topPostion 0: one element at objects[0]
    int topPosition = -1;
    Object[] objects = new Object[50];

    @Override
    public void push(Object o) {
        topPosition++;
        objects[topPosition] = o;
    }

    @Override
    public Object pop() {
        Object o = objects[topPosition];
        topPosition--;
        return o;
    }

    @Override
    public Object peek() {
        return objects[topPosition];
    }

    @Override
    public void clear() {
        topPosition = -1;
    }

    @Override
    public boolean isEmpty() {
        return (topPosition == -1);
    }
}
