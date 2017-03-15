package chapter1.unit5;

/**
 * Created by ios on 17/3/15.
 * 路径压缩的quickUnionsuanf
 * 通过在find方法中加入一个循环,把根节点下面的子节点都添加到根节点下面来
 */
public class PathCompressionQuickUnionUF {
    private int[] id;
    private int[] sz;
    private int count;

    public PathCompressionQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0;i < N - 1; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        int temp = p;
        while (p != id[p]) p = id[p];
        /*将这棵树的所有子节点压缩到同一级*/
        int root = p;
        while (temp != root) {
            int nextp = id[temp];
            id[temp] = root;
            temp = nextp;
        }
        return root;
    }

    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;
        if (sz[pRoot] < sz[qRoot]) { id[pRoot] = qRoot; sz[qRoot] += sz[pRoot]; }
        else { id[qRoot] = pRoot; sz[pRoot] += sz[qRoot]; }
        count--;
    }
}
