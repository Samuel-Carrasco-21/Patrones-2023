package Ejercicio_Fila_B.Ejercicio3;

public class ShortsCreator extends Creator{

    @Override
    public IElemento factoryMethod() {
        // TODO Auto-generated method stub
        Shorts shorts = new Shorts();
        shorts.setTamano(40);
        shorts.setPrecio(90);
        shorts.create();;
        return shorts;
    }
    
}
