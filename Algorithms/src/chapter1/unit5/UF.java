package chapter1.unit5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by ios on 17/3/15.
 * union-find的实现
 * 给出两个节点,看他们是否联通,如果不联通,就加上一条线,让他们联通
 */
abstract class UF {
    private int[] id;   //分量id（以触点作为索引）
    private int count;  //一共有多少联通的分量

    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int count() { return getCount(); }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    protected abstract int find(int p);
    protected abstract void union(int p, int q);


    protected int[] getId() {
        return id;
    }

    protected int getCount() {
        return count;
    }

}

/**
 * 利用quickFind方法来实现
 */
class QuickFind extends UF {
    private int[] id;
    private int count;

    public QuickFind(int N) {
        super(N);
        id = super.getId();
        count = super.getCount();
    }

    //返回当前所在的连通分量
    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) return;
        //将p的分量,重命名为q的名称
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
            count--;
        }
    }

    protected int[] getId() {
        return id;
    }

    protected int getCount() {
        return count;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new QuickFind(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(Arrays.toString(uf.getId()));
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }
}

/**
 * id数组用父连接的形式,表示了一片森林
 */
class QuickUnion extends UF {
    private int[] id;
    private int count;

    public QuickUnion(int N) {
        super(N);
        id = super.getId();
        count = super.getCount();
    }

    //返回根节点所对应的点的名称
    @Override
    protected int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    @Override
    protected void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (qRoot == pRoot) return;

        id[pRoot] = qRoot;

        count--;
    }

    protected int[] getId() {
        return id;
    }

    protected int getCount() {
        return count;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new QuickUnion(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(Arrays.toString(uf.getId()));
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }
}
