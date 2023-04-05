package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList<Integer> list;

    @Before
    public void before(){
        list = new SinglyLinkedList<Integer>();
    }

    //add an element to the list
    @Test
    public void addTest() {
        Integer expected = 1;
        list.add(10);

        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    //remove -- remove an element (specified by numeric index) from the list
    @Test
    public void removeTest() {
        Integer expected = 1;
        list.add(10);
        list.add(20);
        list.remove(10);

        Integer actual = list.size();
    }

    //contains -- returns true if the element is in the list, false otherwise
    @Test
    public void containsTest() {
        Integer expected = 10;
        list.add(expected);
        Integer actual = list.contains(expected);

        Assert.assertEquals(expected, actual);
    }

    //find -- returns the element's index if it is in the list, -1 otherwise
    @Test
    public void findTest() {
        list.add(10);
        list.add(15);

        Integer expected = 1;

        Integer actual = list.find(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest2() {
        list.add(10);
        list.add(15);

        Integer expected = -1;

        Integer actual = list.find(20);

        Assert.assertEquals(expected, actual);
    }

    //size -- returns the current size of the list
    @Test
    public void sizeTest() {
        list.add(10);
        Integer expected = 1;

        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    //get -- returns the element at the specified index
    @Test
    public void getTest() {
        list.add(10);
        list.add(20);

        int expected = 1;

        int actual = list.get(expected);

        Assert.assertEquals(expected, actual);
    }

    //copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    @Test
    public void copyTest() {
        list.add(20);
        list.add(30);
        list.add(15);

        SinglyLinkedList<Integer> newList = list.copy();

        Assert.assertNotEquals(list.toString(), newList.toString());
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i).data, newList.get(i).data);
        }
    }

    //sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    @Test
    public void sortTest() {
        list.add(20);
        list.add(30);
        list.add(15);

        Integer pos0 = 15;
        Integer pos2 = 30;
        
        SinglyLinkedList<Integer> actual = list.sort();

        Assert.assertTrue(pos0 == actual.get(0).data && pos2 == actual.get(2).data);
    }
}
