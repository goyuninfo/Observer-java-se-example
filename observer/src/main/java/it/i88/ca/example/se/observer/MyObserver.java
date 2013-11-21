package it.i88.ca.example.se.observer;

import java.util.Observable;
import java.util.Observer;

class MyObserver implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("update: " + arg);
    }
}
