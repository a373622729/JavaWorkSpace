package chapter2.unit2;

/**
 * Created by ios on 17/3/19.
 * 归并排序
 * 即将两个有序的数组归并为一个更大的有序数组
 * 长度为N的数组,排序需要NlogN的时间, 缺点是需要额外的空间N
 */
public class Merge {
    private static Comparable[] aux; //归并需要另外一个数组

    //自底向上的归并排序
    public static void sort1(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz += sz) {
            for (int lo = 0; lo < N - sz; lo += sz+sz ) {
                merge(a, lo, lo + sz - 1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

    //自顶向下的归并排序, 需要(1/2)NlogN 至 NlgN
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    /**
     *可以改进的地方:
     * 1.对于小数组,插入排序的效率会更好,因此在分治为小数组的时候调用插入排序来排序,然后再归并
     * 2.判断a[mid] < a[mid+1],不需要归并
     * 3.节省将数组元素复制到辅助数组所用的时间
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        if (less(a[mid], a[mid+1])) return; //左端最大比右端最小的小,那么已经有序,不需要归并
        merge(a, lo, mid, hi);
    }

    /**
     * 原地归并,将一个数组的有序的低端和有序的高端归并为整个数组有序
     * @param a     要归并的数组
     * @param lo    要归并的数组的低端的起始位置
     * @param mid   要归并的数组的低端的结束位置
     * @param hi    要归并的数独的高端的结束位置
     */
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        System.arraycopy(a, lo, aux, lo, hi + 1 - lo);
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                    a[k] = aux[j++];      //低端的数组遍历完了
            else if (j > hi)                a[k] = aux[i++];  //高端的数组遍历完了
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
