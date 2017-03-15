package chapter2.unit1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * Created by ios on 17/3/15.
 * 适用于基本有序的数组排序
 * 长度为N的数组, 平均情况下需要 ~(N^2)/4次比较 ~(N^2)/4次交换
 * 最坏情况  需要  ~(N^2)/2 次比较 和 ~(N^2)/2 次交换
 * 最好情况需要N-1次比较, 0次交换
 */
public class Insertion {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    //插入排序的优化,让有序的部分右移,这样可以减少一半对数组访问的操作
    public static void sort1(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable temp = a[i];
            int j;
            for ( j = i; j > 0 && less(temp, a[j-1]); j--) {
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }

    private static void show(Comparable[] a) {
        System.out.println(Arrays.toString(a));
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    //s o r t e x a m p l e
    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort1(a);
        assert isSorted(a);
        show(a);
    }
}
