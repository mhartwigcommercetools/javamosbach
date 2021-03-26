package com.education.mosbach.algorithms.structures.storageImpl;

import com.education.mosbach.algorithms.structures.storage.Storage;

import java.util.ArrayList;

public class ArrayListStackStorageImpl implements Storage {

    ArrayList<Object> objects = new ArrayList<>();

    @Override
    public void push(Object o) {
        objects.add(o);
    }

    @Override
    public Object pop() {
        if (objects.size() == 0) return null;
        return objects.remove(objects.size() - 1);
    }

    @Override
    public Object peek() {
        if (objects.size() == 0) return null;
        return objects.get(objects.size() - 1);
    }

    @Override
    public void clear() {
        objects.clear();
    }

    @Override
    public boolean isEmpty() {
        return
                (objects.size() == 0);
    }
}
