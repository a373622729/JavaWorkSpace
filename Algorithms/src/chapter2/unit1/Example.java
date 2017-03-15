package chapter2.unit1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * Created by ios on 17/3/15.
 * 一个排序算法类的模板
 */
public class Example {
    public static void sort(Comparable[] a) {

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

    public static boolean isSorted(Comparable[] a) {
        for (int i= 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
