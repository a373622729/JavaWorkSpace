package chapter3.unit1;


import edu.princeton.cs.algs4.Queue;

/**
 * Created by ios on 17/3/30.
 * 基于无序链表实现的符号表
 */
public class SequentialSearchST<Key, Value> {
    //edu.princeton.cs.algs4.SequentialSearchST
    //edu.princeton.cs.algs4.ST
    private Node first;
    private int n;
    private class Node {
        Key key;
        Value value;
        Node next;
        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("arugment to get() is null");
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.value;   //命中
        }
        return null;
    }

    public void put(Key key, Value value) {
        if (key == null) throw new IllegalArgumentException("argument to put() is null");
        if (value == null) {
            delete(key);
            return;
        }
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {  //命中
                x.value = value;
                return;
            }
        }
        first = new Node(key, value, first); //未命中,新建节点
        n++;
    }

    public void delete(Key key) {
        if (key == null) throw  new IllegalArgumentException("argument to delete() is null");
        first = delete(first, key);
    }

    public Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.next) {
            queue.enqueue(x.key);
        }
        return queue;
    }

}
