package panicbutton.core;

import java.util.Stack;

public class SettingsCaretaker {
    private final Stack<Memento> estadosSalvos = new Stack<>();

    public void salvarEstado(PanicButtonSystem sistema) {
        estadosSalvos.push(new Memento(sistema.getUsuarioAtual()));
        System.out.println("Estado salvo: " + sistema.getUsuarioAtual());
    }

    public void restaurarEstado(PanicButtonSystem sistema) {
        if (!estadosSalvos.isEmpty()) {
            Memento memento = estadosSalvos.pop();
            sistema.setUsuarioAtual(memento.getUsuarioSalvo());
            System.out.println("Estado restaurado para: " + memento.getUsuarioSalvo());
        }
    }
}
