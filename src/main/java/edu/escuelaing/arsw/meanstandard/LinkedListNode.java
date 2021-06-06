package edu.escuelaing.arsw.meanstandard;

public class LinkedListNode<T> {
    private T value;
    private LinkedListNode<T> next;

    public LinkedListNode(){
        value = null;
        next = null;
    }

    public LinkedListNode(T element){
        value = element;
        next = null;
    }

    public void nextNode(LinkedListNode<T> element){
        next = element;
    }

    public T getValue(){
        return value;
    }
}
