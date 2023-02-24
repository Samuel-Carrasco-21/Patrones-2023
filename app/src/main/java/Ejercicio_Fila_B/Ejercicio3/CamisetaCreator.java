package Ejercicio_Fila_B.Ejercicio3;

public class CamisetaCreator extends Creator{

    @Override
    public IElemento factoryMethod() {
        // TODO Auto-generated method stub
        Camiseta camiseta = new Camiseta();
        camiseta.setTamano(40);
        camiseta.setPrecio(50);
        camiseta.create();
        return camiseta;
    }
    
}
