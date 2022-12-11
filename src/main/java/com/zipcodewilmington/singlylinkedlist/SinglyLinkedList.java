package com.zipcodewilmington.singlylinkedlist;

import java.util.Arrays;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    public Node<T> head;
    public Node<T> tail;
    public int length = 0;

    public SinglyLinkedList() { //[10,20] [20,30] [30,40] [40, null]

    }

    public SinglyLinkedList(T data) {
        head = new Node(data);
        length = 1;
    }

    //add -- add an element to the list
    public void add(T data) {
        Node nodeToAdd = new Node(data, null);

        if(length == 0) { //or if head == null
            head = nodeToAdd; // [10,null]
        } else {
            tail.setNext(nodeToAdd);
        }
        tail = nodeToAdd;
        length++;
    }

    //size -- returns the current size of the list
    public int getLength() { return length;}

    //get -- returns the element at the specified index
    public T getValueAtIndex(int index) {
//        if (index == 0) {
//            return head.data; }
//        Node temp = head.getNext();
//        if (index == 1) {
//            return (T) temp.data; }
//        else {
//            for (int i = 2; i < length; i++) { //5
//                temp = temp.getNext();
//                if (i == index) {
//                    return (T) temp.getData();
//                }
//            }
//        }
        Node current = head;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                return (T) current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    //remove -- remove an element (specified by numeric index) from the list

    public void remove(int index) { //[10,null]
        Node current = head;
        if(index > length-1) {
            System.out.println("Index does not exist.");
        } else if (index == 0) {
            head = head.next;
            length--;
        } else {
            for (int i = 0; i < length; i++) {
//                if (i+1 == index && index == length-1) { //IS LAST
//                    //[10,20] [20,null]
//                    current.next = null;
//                    tail = current;
//                    length--;
//                    break;
//                }
//                if (i+1 == index && index != length-1) { //NOT LAST
//                    current.next = current.next.next;
//                    length--;
//                }
                if(i == (index-1)) {
                    current.next = current.next.next;
                    length--;
                }
                current = current.getNext();
            }
        }
    }

    //contains -- returns true if the element is in the list, false otherwise
    public boolean contains(T data) {
        Node temp = head;
        for (int i = 0; i < length; i++) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //find -- returns the element's index if it is in the list, -1 otherwise
    public int find(T data) {
        Node temp = head;
        for (int i = 0; i < length; i++) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    //copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> singly = new SinglyLinkedList<T>();
        Node temp = head;
        for (int i = 0; i < length; i++) {
            singly.add((T) temp.getData());
            temp = temp.next;
        }
        return singly;
    }

    //sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    public void sort() {
        boolean sorted = false; //create sorted flag
        Node current = head; //create starting node
        Node next = current.next; //created following node

        for (int i = 0; i < length; i++) {

            //if(current.data > next.data) {

            }









    }

    public void reverse() {
        //iterate through
        //change head to null, set as tail
        //change tail's null to point, set as head
        //make next point at previous data of ea Node
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < length; i++) {
//            if(temp.next == null) {
//                sb.append(temp.data);
//            } else {
                sb.append(temp.data+", ");
                temp = temp.getNext();
//            }
        }
        return sb.toString();
    }
}
