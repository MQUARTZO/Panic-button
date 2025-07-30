package panicbutton.core;

public class AlertBuilder {
    private String mensagem = "";
    private boolean incluirLocalizacao = false;

    public AlertBuilder comMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public AlertBuilder comLocalizacao(boolean incluir) {
        this.incluirLocalizacao = incluir;
        return this;
    }

    public String construir() {
        String alerta = "[ALERTA] ";
        if (!mensagem.isEmpty()) {
            alerta += "Mensagem: " + mensagem + ". ";
        }
        if (incluirLocalizacao) {
            alerta += "Localização: GPS simulado ativado.";
        }
        return alerta;
    }
}
