package singleton.practica1;

public class EmpresaCambioMoneda {
    private static EmpresaCambioMoneda instance = null;
    private Float valorDol;
    private Float valorEur;

    private EmpresaCambioMoneda(){
        valorDol = (float) 7;
        valorEur = (float) 9;
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new EmpresaCambioMoneda();
    }

    public static EmpresaCambioMoneda getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public synchronized Float conversionDinero(String moneda1, String moneda2, Float amount) {
        moneda1 = moneda1.toLowerCase();
        moneda2 = moneda2.toLowerCase();
        Float result = (float) 0;
        if(moneda1.equals("boliviano")){
            if(moneda2.equals("dolar")){
                result = amount/valorDol;
            }else{
                result = amount/valorEur;
            }
        }else if(moneda1.equals("dolar")){
            if(moneda2.equals("boliviano")){
                result = amount*valorDol;
            }else{
                result = (amount*valorDol)/(valorEur);
            }
        }else{
            if(moneda2.equals("dolar")){
                result = (amount*valorEur)/(valorDol);
            }else{
                result = amount*valorEur;
            }
        }
        System.out.println("CAMBIO EXITOSO:");
        System.out.println(moneda1+": "+amount);
        System.out.println(moneda2+": "+result);
        return result;
    }


}
