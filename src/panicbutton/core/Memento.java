
package panicbutton.core;

public class Memento {
    private final String usuario;

    public Memento(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioSalvo() {
        return usuario;
    }
}