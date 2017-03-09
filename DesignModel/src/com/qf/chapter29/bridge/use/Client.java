package com.qf.chapter29.bridge.use;

/**
 * Created by ios on 16/11/21.
 */

/**
 * 如果要增加一个产品,那么只需要增加一个 产品类就行了
 */

public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("---房地产公司---");
        HouseCorp houseCorp =  new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println("---山寨公司---");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
