package panicbutton.core;

public class AlertCommand {
    private final Runnable action;

    public AlertCommand(Runnable action) {
        this.action = action;
    }

    public void execute() {
        System.out.println("Executando comando de alerta...");
        action.run();
    }
}