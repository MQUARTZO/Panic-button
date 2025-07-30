package panicbutton.core;

public class AlertContext {
    private AlertStrategy estrategia;

    public void setEstrategia(AlertStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void enviarAlerta(String destino, String mensagem) {
        if (estrategia != null) {
            estrategia.enviar(destino, mensagem);
        } else {
            System.out.println("Nenhuma estratégia de envio definida.");
        }
    }
}
