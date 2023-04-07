package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
//    SinglyLinkedList<Integer> list;
//
//    @Before
//    public void before(){
//        list = new SinglyLinkedList<Integer>();
//    }

    //add an element to the list
    @Test
    public void addTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expected = 1;
        list.add(10);

        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    //remove -- remove an element (specified by numeric index) from the list
    @Test
    public void removeTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expected = 1;
        list.add(10);
        list.add(20);
        list.remove(10);

        Integer actual = list.size();
    }

    //contains -- returns true if the element is in the list, false otherwise
    @Test
    public void containsTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expected = 10;
        list.add(expected);
        Boolean actual = list.contains(expected);

        Assert.assertTrue(actual);
    }

    @Test
    public void containsTest2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        Integer expected = 10;
        list.add(expected);
        Boolean actual = list.contains(15);

        Assert.assertFalse(actual);
    }

    //find -- returns the element's index if it is in the list, -1 otherwise
    @Test
    public void findTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.add(10);
        list.add(15);

        Integer expected = 1;

        Integer actual = list.find(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest2() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.add(10);
        list.add(15);

        Integer expected = -1;

        Integer actual = list.find(20);

        Assert.assertEquals(expected, actual);
    }

    //size -- returns the current size of the list
    @Test
    public void sizeTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.add(10);
        Integer expected = 1;

        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    //get -- returns the element at the specified index
    @Test
    public void getTest() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.add(10);
        list.add(20);

        Integer expected = 20;

        Integer actual = (Integer) list.get(1).getData();

        Assert.assertEquals(expected, actual);
    }
//
//    //copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//    @Test
//    public void copyTest() {
//        list.add(20);
//        list.add(30);
//        list.add(15);
//
//        SinglyLinkedList<Integer> newList = list.copy();
//
//        Assert.assertNotEquals(list.toString(), newList.toString());
//        for (int i = 0; i < list.size(); i++) {
//            Assert.assertEquals(list.get(i).getData(), newList.get(i).getData());
//        }
//    }
//
//    //sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
//    @Test
//    public void sortTest() {
//        list.add(20);
//        list.add(30);
//        list.add(15);
//
//        Integer pos0 = 15;
//        Integer pos2 = 30;
//
//
//        Assert.assertTrue(pos0 == list.get(0).getData() && pos2 == list.get(2).getData());
//    }
}
