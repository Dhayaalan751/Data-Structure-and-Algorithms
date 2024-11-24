package com.dhayaalan.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtFirst(2);
        linkedList.insertAtFirst(3);
        linkedList.insertAtFirst(4);
        linkedList.insertAtFirst(5);
        linkedList.display();
        linkedList.insertAtLast(6);
        linkedList.display();
    }
}
