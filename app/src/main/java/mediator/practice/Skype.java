package mediator.practice;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion {
    private Map<Integer,Profesional> profesionalChat = new HashMap<>();

    public Skype addProfesionalToTheChat(Profesional profesional) {
        profesionalChat.put(profesional.getCi(), profesional);
        return this;
    }

    @Override
    public void send(String message, Persona persona) {
        for (Map.Entry<Integer, Profesional> entry : profesionalChat.entrySet()) {
            if (!(persona.getCi()==entry.getValue().getCi())) {
                if (persona.getCargo().equals("QA") && entry.getValue().getCargo().equals("QA")) {
                    entry.getValue().received(message);
                } else if (persona.getCargo().equals("DEV") && entry.getValue().getCargo().equals("DEV")) {
                    entry.getValue().received(message);
                } else if (persona.getCargo().equals("SM")) {
                    entry.getValue().received(message);
                }
            }
        }
    }
    
}
