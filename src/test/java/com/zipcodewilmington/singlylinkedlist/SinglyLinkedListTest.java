package com.zipcodewilmington.singlylinkedlist;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void NodeConTest() {
        Node<Integer> node = new Node<Integer>(10);
        int expected = 10;
        int actual = node.data;
        assertEquals(actual, expected);
    }
}
