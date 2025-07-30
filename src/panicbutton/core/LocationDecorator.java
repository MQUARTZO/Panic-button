package panicbutton.core;

public class LocationDecorator extends AlertDecorator {
    private String localizacao;

    public LocationDecorator(Alert alert, String localizacao) {
        super(alert);
        this.localizacao = localizacao;
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Localização do alerta: " + localizacao);
    }
}
