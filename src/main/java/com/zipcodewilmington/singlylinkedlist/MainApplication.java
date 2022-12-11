package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();

        singly.add(4);
        singly.add(2);
        singly.add(1);
        singly.add(3);
        singly.add(5);
        System.out.println("Original: "+singly.toString());






        singly.sort();
        //System.out.println("Sorted 1: "+singly.toString());
        singly.sort();
        System.out.println("Sorted 2: "+singly.toString());






    }
}
