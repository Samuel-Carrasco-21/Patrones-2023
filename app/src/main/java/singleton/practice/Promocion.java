package singleton.practice;

public class Promocion {
    private int IDPromocion;
    public int getIDPromocion() {
        return IDPromocion;
    }
    private float descuento;
    public float getDescuento() {
        return descuento;
    }
    public Promocion(int iDPromocion, float descuento) {
        this.IDPromocion = iDPromocion;
        this.descuento = descuento;
    }
}
