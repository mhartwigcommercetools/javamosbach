package com.education.mosbach.algorithms.structures.storageImpl;

import com.education.mosbach.algorithms.structures.storage.Storage;

/**
 * Take care! Stack can only hold 50 or less elements.
 */
public class DynamicArrayStackStorageImpl implements Storage {

    int initialLength = 1;
    int incrementalLength = 1;

    // topPosition -1: no elements stored
    // topPostion 0: one element at objects[0]
    int topPosition = -1;
    Object[] objects = new Object[initialLength];

    @Override
    public void push(Object o) {
        if (topPosition == objects.length - 1) {
            Object[] temp = new Object[objects.length + incrementalLength];
            for (int i = 0; i <= topPosition; i++)
                temp[i] = objects[i];
            objects = temp;
        }
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
