package com.qf.chapter8.factory.nvwa;

/**
 * Created by ios on 16/10/19.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        Human yelloHuman = factory.createHuman(YellowHuman.class);
        yelloHuman.getColor();
        yelloHuman.talk();
    }
}
