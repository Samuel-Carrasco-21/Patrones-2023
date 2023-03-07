package visitor.practice;

public class Turista implements IPersona{

    @Override
    public void cambioMoneda(Bolivia bolivia, int dinero, String tipoMoneda) {
        bolivia.datosPais();
        
        String textoFinal = "";
        System.out.println("--- Conversion exitosa ---");
        if(tipoMoneda.toLowerCase().equals("dolares")){
            textoFinal += ((float)dinero/(float)7) + " $us";
        }else if(tipoMoneda.toLowerCase().equals("dolares y euros")){
            textoFinal += ((float)dinero/(float)7) + " $us - ";
            textoFinal += ((float)dinero/(float)8) + " eu";
        }else{
            textoFinal += ((float)dinero/(float)8) + " eu";
        }
        System.out.println("Dinero Obtenido:");
        System.out.println("* "+textoFinal);
    }

    @Override
    public void cambioMoneda(USA usa, int dinero, String tipoMoneda) {
        usa.datosPais();

        String textoFinal = "";
        System.out.println("--- Conversion exitosa ---");
        if(tipoMoneda.toLowerCase().equals("euros")){
            textoFinal += ((float)dinero/(float)1.2) + " eu";
        }else if(tipoMoneda.toLowerCase().equals("euros y bolivianos")){
            textoFinal += ((float)dinero/(float)1.2) + " eu - ";
            textoFinal += ((float)dinero*(float)7) + " bs";
        }else{
            textoFinal += ((float)dinero*(float)7) + " bs";
        }
        System.out.println("Dinero Obtenido:");
        System.out.println("* "+textoFinal);
    }

    @Override
    public void cambioMoneda(Europa europa, int dinero, String tipoMoneda) {
        europa.datosPais();

        String textoFinal = "";
        System.out.println("--- Conversion exitosa ---");
        if(tipoMoneda.toLowerCase().equals("dolares")){
            textoFinal += ((float)dinero*(float)1.2) + " $us";
        }else if(tipoMoneda.toLowerCase().equals("dolares y bolivianos")){
            textoFinal += ((float)dinero*(float)1.2) + " $us - ";
            textoFinal += ((float)dinero*(float)8) + " bs";
        }else{
            textoFinal += ((float)dinero*(float)8) + " bs";
        }
        System.out.println("Dinero Obtenido:");
        System.out.println("* "+textoFinal);
    }

    
    
}
