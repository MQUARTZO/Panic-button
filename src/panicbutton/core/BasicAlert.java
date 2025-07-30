package panicbutton.core;

public class BasicAlert implements Alert {
    @Override
    public void send() {
        System.out.println("Alerta básico enviado.");
    }
}
