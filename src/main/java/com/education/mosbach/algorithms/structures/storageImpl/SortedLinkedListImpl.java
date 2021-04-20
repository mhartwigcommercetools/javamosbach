package com.education.mosbach.algorithms.structures.storageImpl;

import com.education.mosbach.algorithms.structures.storage.LinkedList;

import java.util.ArrayList;

public class SortedLinkedListImpl implements LinkedList {

    Node root = null;

    @Override
    public void insertNode(Integer i) {

        Node temp = null;
        Node previous = null;

        // if root == null dann einfach so einfuegen
        if (root == null) {
            Node node = new Node(i, null);
            root = node;
        }
        else {
            temp = root;

            // previous setzen
            while ((temp.getElement() < i)  && (temp.getNext() != null))
                temp = temp.getNext();


            // TODO fuer die gesamte Klasse, allein beenden
            //

            // einfuegen, Zeiger sauber verbiegen

        }

    }

    @Override
    public ArrayList<Integer> getAllElements() {
        return null;
    }
}
