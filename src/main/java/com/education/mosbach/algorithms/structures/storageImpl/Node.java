package com.education.mosbach.algorithms.structures.storageImpl;

public class Node {

    private Integer element;
    private Node next;

    public Node(Integer element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
