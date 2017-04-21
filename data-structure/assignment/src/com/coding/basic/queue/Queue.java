package com.coding.basic.queue;

import java.util.NoSuchElementException;

public class Queue {
    private Node first;    
    private Node last;     
    private int size;               

    
    private static class Node{
        private Object item;
        private Node next;
    }

    public Queue() {
        first = null;
        last  = null;
        size = 0;
    }

    public boolean isEmpty() {
    	
        return false;
    }

    public int size() {
    	
        return size;
    }

    public void enQueue(Object data) {
    	
    }

    public Object deQueue() {
       
        return null;
    }

}
