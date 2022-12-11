package com.zipcodewilmington.singlylinkedlist;

//public class Node<T extends  Comparable<T>> implements Comparable<T>{
public class Node<T extends Comparable<T>>{
    public T data;
    public Node<T> next; //references the next obj of Type node, pointer

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return " [data: "+data+", pointer: "+next+" ],";
    }


//    public int compareTo(T o) {
//        return this.data.compareTo(o.data);
//    }
}
