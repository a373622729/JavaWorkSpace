package chapter1.linkList;

import java.util.Iterator;

/**
 * Created by ios on 17/3/9.
 */
public class Bag<Item> implements Iterable<Item>{
    private class Node {
        Item item;
        Node next;
    }
    private Node first;

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
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
