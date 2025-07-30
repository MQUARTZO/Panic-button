package panicbutton.core;

public class SettingsManager {
    private static SettingsManager instancia;

    private String mensagem = "Estou em perigo! Preciso de ajuda!";
    private String localizacao = "Localização desconhecida";

    private SettingsManager() {
        // Construtor privado
    }

    public static SettingsManager getInstance() {
        if (instancia == null) {
            instancia = new SettingsManager();
        }
        return instancia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
