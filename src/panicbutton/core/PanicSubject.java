package panicbutton.core;

import java.util.ArrayList;
import java.util.List;

public class PanicSubject {
    private List<PanicObserver> observers = new ArrayList<>();

    public void addObserver(PanicObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PanicObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (PanicObserver observer : observers) {
            observer.onPanicActivated();
        }
    }

    // Simula o acionamento do botão de pânico
    public void pressPanicButton() {
        System.out.println("Botão de pânico pressionado.");
        notifyObservers();
    }
}