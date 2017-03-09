package com.qf.chapter15.command.group;

/**
 * Created by ios on 16/10/31.
 */

/**
 * 这里的Client代表客户,那么每次要求更改需求的时候,必须分别把特定的组叫过来,这样很麻烦,所以可以定一个接头人,直接和Client谈,
 * 至于下面怎么安排,怎么分工 的,客户不需要知道
 *
 * 而 这个接头人发出的命令,不要用字符串String,因为String没有约束力,
 * 所以,对客户发出的命令进行封装,每个命令是一个对象.避免客户\负责任\组员之间的交流误差.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------客户要求增加一项需求------");
        AbstractGroup rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();
    }
}
