package panicbutton.core;

public class PanicButtonSystem {
    private static PanicButtonSystem instance;

    // Atributos que representarão o estado global do sistema (configurações, etc.)
    private String usuarioAtual;

    private PanicButtonSystem() {
        // Construtor privado impede instanciação externa
    }

    public static synchronized PanicButtonSystem getInstance() {
        if (instance == null) {
            instance = new PanicButtonSystem();
        }
        return instance;
    }

    public void setUsuarioAtual(String usuario) {
        this.usuarioAtual = usuario;
    }

    public String getUsuarioAtual() {
        return usuarioAtual;
    }

    public void iniciarSistema() {
        System.out.println("Sistema de Botão de Pânico iniciado para: " + usuarioAtual);
    }
}
