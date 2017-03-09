package com.qf.chapter22.observer.observeable;

/**
 * Created by ios on 16/11/11.
 */
//被观察者
public interface Observable {
    public abstract void addObserver(Observer observer);

    void deleteObserver(Observer observer);
    //通知观察者
    void notifyObservers(String context);
}
