package com.qf.chapter21.combination.universal;

/**
 * Created by ios on 16/11/10.
 */
//场景类,负责创建真各个树, 并且以递归的方式遍历树
public class Client{
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root) {
        for (AComponent component: root.getChildren()) {
            if (component instanceof Leaf) {
                component.doSomething();
            } else {
                display((Composite)component);
            }
        }
    }
}
