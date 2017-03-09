package com.qf.chapter22.observer.universal;

/**
 * Created by ios on 16/11/11.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();

        subject.addObserver(obs);
        subject.doSomething();
    }
}
