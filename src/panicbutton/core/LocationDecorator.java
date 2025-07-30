package panicbutton.core;

public class LocationDecorator extends AlertDecorator {

    public LocationDecorator(Alert alert) {
        super(alert);
    }

    @Override
    public void send() {
        super.send();
        adicionarLocalizacao();
    }

    private void adicionarLocalizacao() {
        System.out.println("Localização anexada: Latitude -7.11532, Longitude -34.861");
    }
}
