package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node<T> head;

    public void add(T value) {
        if(head == null){
            head = new Node<T>(value);
        }else{
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Node<T>(value));
        }
    }

    public int size() {
        int count = 1;
        if(head == null){
            return 0;
        }else{
            Node<T> current = head;
            while(current.getNext() != null){
                count++;
                current = current.getNext();
            }
        }
        return count;
    }

    public void remove(T i) {
    }

    public Boolean contains(T expected) {
        if(head == null){
            return false;
        }else{
            Node<T> current = head;
            while(current.getData() != null){
                if(current.getData().equals(expected)){
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
    }

    public int find(T value) {
        if(head == null){
            return -1;
        }else{
            int count = 0;
            Node<T> current = head;
            while(current.getData() != null){
                if(current.getData().equals(value)){
                    return count;
                }
                count++;
                current = current.getNext();
            }
        }
        return -1;
    }

    public Node get(Integer expected) {
        Node<T> current = head;
        if(current == null){
            return null;
        }else{
            int count = 0;
            while(expected != count){
                count++;
                current = current.getNext();
            }
        }
        return current;
    }

//    public SinglyLinkedList<T> copy() {
//        SinglyLinkedList<T> newList;
//        return newList;
//    }
//
//    public void sort() {
//    }
}
