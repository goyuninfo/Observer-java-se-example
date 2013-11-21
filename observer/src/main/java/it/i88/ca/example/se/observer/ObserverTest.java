package it.i88.ca.example.se.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Observered oed = new Observered();
        MyObserver mo1 = new MyObserver();
        MyObserver mo2 = new MyObserver();
      
        oed.addObserver(mo1);
        oed.addObserver(mo2);
      
        oed.updateNoticeBoard("Event from i88.ca occurs");

    }
}