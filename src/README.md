# Panic-button App 🚨

Aplicativo simulado de **botão de pânico** desenvolvido em **Java**, com interface gráfica em **Swing**. O objetivo é permitir que o usuário configure uma mensagem personalizada e localização simulada, podendo enviar um alerta em caso de emergência.

---

## 🛠️ Tecnologias Utilizadas

| Recurso               | Descrição                                                        |
|-----------------------|------------------------------------------------------------------|
| **Java SE**           | Linguagem de programação principal                              |
| **Java Swing**        | Construção da interface gráfica                                 |
| **Padrões de Projeto**| Arquitetura de software orientada a boas práticas de design     |
| **JavaMail (simulado)**| Simulação do envio de mensagens por e-mail (sem envio real)    |
| **Mock GPS**          | Simulação de localização como string (não usa GPS real)         |

---

## 📁 Estrutura do Projeto

```
panicbutton/
├── AppMain.java                  # Ponto de entrada
├── ui/
│   ├── MainUI.java               # Interface principal
│   └── ConfigUI.java             # Tela de configurações
└── core/
    ├── Alert.java                # Interface base de alertas
    ├── EmailAlert.java          # Alerta via e-mail
    ├── SMSAlert.java            # Alerta via SMS
    ├── NotificationAlert.java   # Alerta via notificação
    ├── AlertFactory.java        # Factory de alertas
    ├── AlertBuilder.java        # Builder de alertas
    ├── AlertCommand.java        # Comando de execução de alerta
    ├── PanicSubject.java        # Classe observável (Observer)
    ├── PanicObserver.java       # Interface Observer
    ├── AlertMemento.java        # Estado salvo do alerta
    ├── AlertOriginator.java     # Origem do memento
    ├── AlertCaretaker.java      # Guardião de estados
    ├── AlertType.java           # Enum com tipos de alerta
    ├── SettingsManager.java     # Singleton de configurações
    ├── BasicAlert.java          # Alerta básico decorável
    ├── AlertDecorator.java      # Decorator base
    ├── MessageDecorator.java    # Adiciona mensagem ao alerta
    ├── LocationDecorator.java   # Adiciona localização ao alerta
```

---

## 🔁 Padrões de Projeto Utilizados

### 1. **Singleton**
- **Classe:** `SettingsManager`
- **Uso:** Garante que exista apenas uma instância central de configurações personalizadas (mensagem e localização).
- **Por quê:** Permite acesso global e centralizado aos dados de configuração sem duplicidade de instância.

### 2. **Observer**
- **Classes:** `PanicSubject`, `PanicObserver`
- **Uso:** Permite que observadores sejam notificados quando o botão de pânico for ativado.
- **Por quê:** Garante desacoplamento entre quem dispara o alerta e quem reage a ele (ex: logs, notificações, envio de mensagens).

### 3. **Command**
- **Classe:** `AlertCommand`
- **Uso:** Encapsula a ação de envio do alerta com método `executar()`.
- **Por quê:** Permite que ações sejam encapsuladas como objetos reutilizáveis e agendáveis.

### 4. **Memento**
- **Classes:** `AlertMemento`, `AlertOriginator`, `AlertCaretaker`
- **Uso:** Armazena o estado anterior de um alerta, permitindo desfazer ou restaurar alertas anteriores.
- **Por quê:** Útil para histórico de alertas ou "rollback" de situações enviadas incorretamente.

### 5. **Factory Method**
- **Classe:** `AlertFactory`
- **Uso:** Cria objetos `Alert` (EmailAlert, SMSAlert, NotificationAlert) com base em um tipo (`AlertType`).
- **Por quê:** Desacopla a criação de objetos da lógica de uso.

### 6. **Builder**
- **Classe:** `AlertBuilder`
- **Uso:** Permite construir objetos `Alert` personalizados passo a passo (ex: com ou sem localização).
- **Por quê:** Torna o código mais legível e flexível para composição de alertas complexos.

### 7. **Decorator**
- **Classes:** `AlertDecorator`, `MessageDecorator`, `LocationDecorator`
- **Uso:** Adiciona funcionalidades extras dinamicamente ao alerta (ex: incluir mensagem e localização).
- **Por quê:** Evita a criação de subclasses específicas para cada combinação, permitindo extensão flexível do comportamento.

---

## ▶️ Como Usar

1. Compile e execute o projeto (`AppMain.java`).
2. Clique em **"Configurações"** para definir:
   - Mensagem personalizada do alerta
   - Localização simulada
3. Clique em **"Ativar Botão de Pânico"** para simular o envio.
4. Veja no console a mensagem e localização configuradas.

---

## 📌 Exemplo de Execução

```
Alerta enviado!
Mensagem personalizada: Preciso de ajuda urgente.
Localização do alerta: João Pessoa - PB
```

---

## 🚧 Futuras Melhorias

- Integração com envio real de SMS/e-mail
- Registro de histórico de alertas (usando Memento)
- Geolocalização real com API externa
- Integração com serviços de emergência

---

## 👨‍💻 Autor

Desenvolvido (Equipe em Analise) — Engenharia de Computação - IFPB