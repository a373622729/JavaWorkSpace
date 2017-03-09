package com.qf.chapter8.factory.nvwa;

/**
 * Created by ios on 16/10/19.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = c.newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T)human;
    }
}
