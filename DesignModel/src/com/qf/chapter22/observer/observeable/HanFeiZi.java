package com.qf.chapter22.observer.observeable;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/11.
 */
public class HanFeiZi implements Observable, IHanFeiZi {
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:要吃饭了...");
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:要娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }

    //IHanFeiZi
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer: observerList) {
            observer.update(context);
        }
    }
}
