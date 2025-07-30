package panicbutton.core;

public class MessageDecorator extends AlertDecorator {
    private final String mensagem;

    public MessageDecorator(Alert alert, String mensagem) {
        super(alert);
        this.mensagem = mensagem;
    }

    @Override
    public void send() {
        super.send();
        adicionarMensagem();
    }

    private void adicionarMensagem() {
        System.out.println("Mensagem personalizada: " + mensagem);
    }
}
