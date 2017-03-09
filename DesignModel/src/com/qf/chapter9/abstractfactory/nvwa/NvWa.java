package com.qf.chapter9.abstractfactory.nvwa;

/**
 * Created by ios on 16/10/20.
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory   = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman   = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
    }
}