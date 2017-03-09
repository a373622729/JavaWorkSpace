package chapter1.unit3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Queue<Item> implements Iterable<Item>{
    private class Node {
        Item item;
        Node next;
    }
    
    private int N;
    private Node first;
    private Node last;
    
    public boolean isEmpty() { return first == null; }
    
    public int size() { return N; }
    
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldLast.next = last;
        N++;        
    }

    public Item peek() {
        if (isEmpty()) { throw new NoSuchElementException("Queue overflow"); }
        return first.item;
    }
    
    public Item dequeue() {
        if (isEmpty()) { throw new NoSuchElementException("Queue overflow"); }
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }
    
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() { return first != null; }
        public void remove() { throw  new UnsupportedOperationException("Queue overflow"); }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String item = scanner.next();
            if (!item.equals("-")) {
                q.enqueue(item);
            } else if (!q.isEmpty()) {
                System.out.print(q.dequeue() + " ");
            }
        }
        System.out.print("(" + q.size() + " left on queue)");
    }
}