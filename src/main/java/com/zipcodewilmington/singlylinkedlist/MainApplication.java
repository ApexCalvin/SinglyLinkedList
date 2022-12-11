package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> singly = new SinglyLinkedList<Integer>();

        singly.add(10); //0
        singly.add(20);
        singly.add(30); //2
        singly.add(40);
        singly.add(50); //4

//        System.out.println(singly.getLength());
//        System.out.println(singly.toString());
//
//        System.out.println(singly.getValueAtIndex(0));
//        System.out.println(singly.getValueAtIndex(1));
//        System.out.println(singly.getValueAtIndex(4));

        singly.remove(4); //40
        System.out.println(singly.toString());

//        System.out.println(singly.contains(60));
//        System.out.println(singly.find(30));

//        SinglyLinkedList singly2 = singly.copy();
//        System.out.println(singly2.toString());


    }
}
