package panicbutton.core;

public class AlertFactory {
    public static AlertStrategy criarEstrategia(AlertType tipo) {
        switch (tipo) {
            case EMAIL:
                return new EmailStrategy();
            case SMS:
                return new SMSStrategy();
            case NOTIFICATION:
                return new NotificationStrategy();
            default:
                throw new IllegalArgumentException("Tipo de alerta desconhecido: " + tipo);
        }
    }
}