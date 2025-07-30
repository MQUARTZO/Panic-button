package panicbutton.core;

public class AlertCommand {
    private Alert alerta;

    public AlertCommand(Alert alerta) {
        this.alerta = alerta;
    }

    public void executar() {
        alerta.enviar();
    }
}
