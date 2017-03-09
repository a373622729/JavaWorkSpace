package com.qf.chapter22.observer.universal;

import java.util.Vector;

/**
 * Created by ios on 16/11/11.
 */
public abstract class Subject {
    //观察者数组
    private Vector<Observer> observerVector = new Vector<Observer>();

    public void addObserver(Observer observer) {
        this.observerVector.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observerVector.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o: this.observerVector) {
            o.update();
        }
    }
}
