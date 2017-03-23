package chapter2.unit3;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by ios on 17/3/21.
 * 快速排序
 * 改进方法
 * 1.对于小数组,插入排序要更快
 */
public class Quick {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a); //随机打断数组,消除对输入的依赖
        sort(a, 0, a.length - 1);
    }

    //三向切分的快速排序,对存在大量重复元素的数组排序效率很高
    //将数组分为< = > 哨兵的三部分
    public static void sort3way(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        //小数组采用插入排序
//        int M = 10; //通常M在5 - 15之间大多数情况都很好
//        if (hi <= lo + M) {
//            Insertion.sort(a, lo, hi);
//            return;
//        }
        if (hi <= lo) return;
        int j = partition(a, lo, hi);  //以j为哨兵,切分为两部分
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i] = a[j]; a[j] = a[i];
    }
}
