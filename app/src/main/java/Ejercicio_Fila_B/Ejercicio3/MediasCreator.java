package Ejercicio_Fila_B.Ejercicio3;

public class MediasCreator extends Creator{

    @Override
    public IElemento factoryMethod() {
        Medias medias = new Medias();
        medias.setTamano(30);
        medias.setPrecio(60);
        medias.create();
        return medias;
    }
    
}
