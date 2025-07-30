package panicbutton.core;

public class NotificationStrategy implements AlertStrategy {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Mostrando NOTIFICAÇÃO para " + destino + ": " + mensagem);
    }
}
