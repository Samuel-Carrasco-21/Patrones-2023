package Ejercicio_Fila_B.Ejercicio3;

public class TenisCreator extends Creator{

    @Override
    public IElemento factoryMethod() {
        Tenis tenis = new Tenis();
        tenis.setTamano(40);
        tenis.setPrecio(80);
        tenis.create();
        return tenis;
    }
    
}
