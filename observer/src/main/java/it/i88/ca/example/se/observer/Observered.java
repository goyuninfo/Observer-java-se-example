package it.i88.ca.example.se.observer;

import java.util.Observable;

class Observered extends Observable {

    private String event;

    public String getEvent() {
        return event;
    }

    public void updateNoticeBoard(String notice) {
        this.event = notice;
        setChanged();
        notifyObservers(notice);
    }
}