package command.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerarComando {
    private Map<String,List<ICommand>> commandList = new HashMap<>();

    public void agregarComandos(String nombreComando,List<ICommand> comandos){
        commandList.put(nombreComando.toUpperCase(), comandos);
    }

    public void runCommands(String nivelComando){
        System.out.println("\n--- "+nivelComando.toUpperCase()+" ---");
        commandList.get(nivelComando.toUpperCase())
        .forEach(i->i.execute());
    }
}
