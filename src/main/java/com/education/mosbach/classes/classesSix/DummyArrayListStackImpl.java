package com.education.mosbach.classes.classesSix;

import com.education.mosbach.algorithms.structures.storage.Storage;
import com.education.mosbach.algorithms.structures.storageImpl.ArrayListStackStorageImpl;

public class DummyArrayListStackImpl {

    public static void main(String[] args) {

        Storage stack = new ArrayListStackStorageImpl();

        // push 2
        stack.push(2);

        // push 4
        stack.push(4);

        // pop => 4
        Integer o1 = (Integer) stack.pop();
        System.out.println("Stack gepoppt: " + o1);

        // peek => 2
        Integer o2 = (Integer) stack.peek();
        System.out.println("Stack gepeekt: " + o2);

        // isEmpty false
        boolean stackEmpty = stack.isEmpty();
        System.out.println("Stack isEmpty: " + stackEmpty);

    }
}
