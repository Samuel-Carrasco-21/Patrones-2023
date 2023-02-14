package prototype.practice;

public class Main {
    public static void main(String[] args) {
        // Eliminar el contenido del archivo "compilacion.txt"
        // antes de ejecutar el programa con nuevos cambios
        SamsungR10 p1 = new 
        SamsungR10(10,
        "Snapdragon 8 Gen 2",
        128, 
        12,
        48, 
        true, 
        2, 
        16, 
        new Accesorios(
        "* Audifonos de 1.2m de largo"
        , "* Cargador de 40w"
        , "* Estuche del logo de Samsung"));

        p1.setSim(
            new Sim(
                "Entel"
                , 60481481
                , new Persona("Jose", 2003)));

        p1.mostrarDatos();

        SamsungR10 celular1 = p1.clone();
        celular1.setSim(
            new Sim(
                "Tigo"
                , asignarNumero()
                , new Persona("Michael", asignarId())));

        SamsungR10 celular2 = p1.clone();
        celular2.setSim(
            new Sim(
                "Viva"
                , asignarNumero()
                , new Persona("Enrique", asignarId())));        
        
        SamsungR10 celular3 = p1.clone();
        celular3.setSim(
            new Sim(
                "Viva"
                , asignarNumero()
                , new Persona("Ambar", asignarId())));

        SamsungR10 celular4 = p1.clone();
        celular4.setSim(
            new Sim(
                "Tigo"
                , asignarNumero()
                , new Persona("Mateo", asignarId())));
        
        SamsungR10 celular5 = p1.clone();
        celular5.setSim(
            new Sim(
                "Entel"
                , asignarNumero()
                , new Persona("Vivian", asignarId())));
        
        celular1.mostrarDatos();
        celular2.mostrarDatos();
        celular3.mostrarDatos();
        celular4.mostrarDatos();
        celular5.mostrarDatos();

        p1.imprimir("\n********************\n");
    }

    public static int asignarNumero(){
        return (int)(Math.random()*100000000);
    }

    public static int asignarId(){
        return (int)(Math.random()*1000);
    }

}
