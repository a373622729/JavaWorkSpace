package com.qf.chapter22.observer.universal;

/**
 * Created by ios on 16/11/11.
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        //doSomething

        super.notifyObservers();
    }
}
