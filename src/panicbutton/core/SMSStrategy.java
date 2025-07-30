package panicbutton.core;

public class SMSStrategy implements AlertStrategy {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino + ": " + mensagem);
    }
}
