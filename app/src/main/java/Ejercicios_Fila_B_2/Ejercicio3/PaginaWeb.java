package Ejercicios_Fila_B_2.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb{
    private List<ISubscriptor> observerList = new ArrayList<>();

    @Override
    public void attach(ISubscriptor observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(ISubscriptor observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String tipo) {
        for(int i=0;i<observerList.size();i++){
            if(observerList.get(i) instanceof Subscriptor){
                Subscriptor subscriptor = (Subscriptor) observerList.get(i);
                if(subscriptor.getTipoNotificacion().equals(tipo)
                || subscriptor.getTipoNotificacion().equals("")
                ){
                    subscriptor.update(tipo);
                }
            }
        }
    }
}
