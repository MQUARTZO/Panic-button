package panicbutton.core;

public abstract class AlertDecorator implements Alert {
    protected Alert decoratedAlert;

    public AlertDecorator(Alert alert) {
        this.decoratedAlert = alert;
    }

    @Override
    public void send() {
        decoratedAlert.send();
    }
}
