package chapter1.unit5;

import java.util.Scanner;

/**
 * Created by ios on 17/3/15.
 * 加权 QuickUnion
 * 总是保证让小树连接在大树上面
 */
public class WeightedQuickUnionUF {
    private int[] id; //父链接数组
    private int[] sz; //各个根节点所对应的分量的大小,树的大小
    private int count;

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;

        //将小树的根节点连接到大树的根节点
        if (sz[pRoot] < sz[qRoot]) { id[pRoot] = qRoot; sz[qRoot] += sz[pRoot]; }
        else { id[qRoot] = pRoot; sz[pRoot] += sz[qRoot]; }
        count --;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(uf.count() + " components");
    }
}
