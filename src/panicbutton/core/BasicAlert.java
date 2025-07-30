package panicbutton.core;

public class BasicAlert implements Alert {
    @Override
    public void enviar() {
        System.out.println("Alerta básico enviado.");
    }
}
