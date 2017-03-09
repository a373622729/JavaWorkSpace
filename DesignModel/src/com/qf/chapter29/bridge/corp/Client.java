package com.qf.chapter29.bridge.corp;

/**
 * Created by ios on 16/11/21.
 */

/**
 * 如果要 把clothesCorp换掉,那就只能新增加一个类 因此,要将产品和工厂建立管理关系.
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司是这样运行的");
        HouseCorp houseCorp = new HouseCorp();

        houseCorp.makeMoney();

        System.out.println("服装公司是这样运行的");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
