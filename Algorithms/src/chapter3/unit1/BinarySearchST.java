package chapter3.unit1;

/**
 * Created by ios on 17/3/30.
 * 基于有序数组实现
 */
public class BinarySearchST<Key extends Comparable<Key>, Value> {
    //edu.princeton.cs.algs4.BinarySearchST
    private Key[] keys;
    private Value[] vals;
    private int N;
    public  BinarySearchST(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }

    public int size() { return N; }
    public boolean isEmpty() { return size() == 0; }

    public Value get(Key key) {
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0)   return vals[i];
        else                                        return null;
    }

    //用二分法找到这个Key对应的索引
    public int rank(Key key) {
        int lo = 0, hi = N - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }

    public void put(Key key, Value val) {
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) {
            vals[i] = val;
            return;
        }
        for (int j = N; j > i; j--) {
            keys[j] = keys[j-1];
            vals[j] = vals[j-1];
        }
        keys[i] = key; vals[i] = val;
        N++;
    }

    public Key min() {
        return keys[0];
    }
    public Key max() {
        return keys[N-1];
    }
    public Key select(int k) {
        return keys[k];
    }

    //向上取整,娶到比Key大的最小的那个,包括自己
    public Key ceiling(Key key) {
        int i = rank(key);
        if (i == N) return null;
        else return keys[i];
    }
    //向下取整,取比Key小的最大的那个,包括自己
    public Key floor(Key key) {
        int i = rank(key);
        if (i < N && key.compareTo(keys[i]) == 0) return keys[i];
        else return keys[i-1];
    }

    public void delete(Key key) {

    }
}
