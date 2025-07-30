package panicbutton.core;

public class MessageDecorator extends AlertDecorator {
    private String mensagem;

    public MessageDecorator(Alert alert, String mensagem) {
        super(alert);
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Mensagem personalizada: " + mensagem);
    }
}
