package chapter2.unit4;

import java.util.NoSuchElementException;

/**
 * Created by ios on 17/3/21.
 * 优先队列,用堆实现
 * 一个位置在k的节点的父节点位置为 k/2 向下取整
 * 一个位置在k的节点的两个子节点位置为 2*k, 2*k+1
 * 一个有N个元素的堆有 lgN 向下取整层
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq; //用数组实现二叉堆,即堆有序的完全二叉树
    private int N = 0; // 存储在pq[1..N]中, pq[0]没有使用

    //容量为max
    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }


    //只需要比较不超过 lgN + 1次
    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    public Key max() {
        return pq[1];
    }

    //只需要比较不超过 2lgN次
    public Key delMax() {
        if (isEmpty()) { throw new NoSuchElementException("MaxPQ is underflow"); }
        Key max = pq[1];
        exch(1, N--);  //和最后一个节点交换
        pq[N+1] = null;  //防止越界
        sink(1);
        return max;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        Key t = pq[i]; pq[i] = pq[j]; pq[j] = t;
    }

    //一个节点变大,需要上浮
    private void swim(int k) {
        while (k > 1 && less(k/2,k)) {
            exch(k/2, k);
            k = k/2;
        }
    }
    //一个节点变小了,要下沉
    private void sink(int k) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k,j);
            k = j;
        }
    }
}
