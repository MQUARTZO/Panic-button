package panicbutton.core;

public class EmailStrategy implements AlertStrategy {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando E-MAIL para " + destino + ": " + mensagem);
    }
}
