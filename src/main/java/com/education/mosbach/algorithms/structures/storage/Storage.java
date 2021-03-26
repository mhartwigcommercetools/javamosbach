package com.education.mosbach.algorithms.structures.storage;

public interface Storage {

    void push(Object o);
    Object pop();
    Object peek();
    void clear();
    boolean isEmpty();

}
