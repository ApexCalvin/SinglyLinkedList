package com.zipcodewilmington.singlylinkedlist;

import static org.testng.Assert.assertEquals;

public class Test {
    @org.testng.annotations.Test
    public void NodeConTest() {
        Node<Integer> node = new Node<Integer>(10);
        int expected = 10;
        int actual = node.data;
        assertEquals(actual, expected);
    }
}
