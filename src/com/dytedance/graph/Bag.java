package com.dytedance.graph;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author jiazhiyuan
 * @date 2021/6/29 7:51 上午
 */
public class Bag<Item> implements Iterable<Item>{

    private Node first;  //链表的首节点

    private class Node{
        Item item;
        Node next;
    }

    public void add(Item item) {
        //采用头插法
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next =oldFirst;
    }


    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


}



    
