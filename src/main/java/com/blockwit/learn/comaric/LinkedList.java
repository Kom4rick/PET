package com.blockwit.learn.comaric;

public class LinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add (String value) {
        if (first.next == null){
            Node node = new Node();
            first.next = node;
            node.value = value;
        }
        if (last.prev == null){
            last.prev = first.next;
            return;
        }
        Node node = new Node();
        node.value = value;
        Node node1 = last.prev;
        node1.next = node;
        node.prev = node1;
        last.prev = node;
    }

    public String get(int index) {
        Node element = first.next;
        int counter = 0;
        while((element != null) && (counter < index)){
            element = element.next;
            counter++;
        }
        if (counter == index)
            return element.value;
        else return null;
    }
    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
