package chapter2.unit1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * Created by ios on 17/3/19.
 * s h e l l s o k r t e x a m p l e
 * 希尔排序
 * 对插入排序的优化
 * 选择出一个递增序列h
 * 先让整个数组变为h有序的,最后h为1的时候再进行一次插入排序
 * 适合用于中等大小的数组
 */
public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1; //1,4,13,40,121,264...
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            assert isSorted(a, h);
            h = h/3;
        }
        assert isSorted(a);
    }

    public static void sort1(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                Comparable temp = a[i];
                int j;
                for (j = i; j >= h && less(temp, a[j-h]); j-=h) {
                    a[j] = a[j-h];
                }
                a[j] = temp;
            }
            h = h/2;
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    private static boolean isSorted(Comparable[] a, int h) {
        for (int i = h; i < a.length; i++) {
            if (less(a[i], a[i-h])) return false;
        }
        return true;
    }

    private static void show(Comparable[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        String[] s = StdIn.readAllStrings();
        Shell.sort1(s);
        show(s);
    }
}
