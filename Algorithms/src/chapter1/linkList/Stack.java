package chapter1.linkList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack<Item> implements Iterable<Item> {
    private class Node<T> {
        T item;
        Node<T> next;
    }
    private Node<Item> first; 
    private int N;
    
    public boolean isEmpty() { return first == null; }
    public int size() { return N; }
    
    public void push(Item item) {
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    
    public Item pop(){
        if (isEmpty()) { throw new NoSuchElementException("Stack underflow");}
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    
    public Item peek() {
        if (isEmpty()) { throw new NoSuchElementException("Stack underflow"); }
        return first.item;
    }
    
    
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Item> {
        private Node<Item> current = first;
        public boolean hasNext() { return current != null ;}
        public void remove() {throw new UnsupportedOperationException("Stack underflow"); }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String item = scanner.next();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) System.out.print(s.pop() + " ");
        }
        System.out.print("(" + s.size() + " left on stack)");
    }
}