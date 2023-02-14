package singleton.practica1;

public class LibreCambista {
    CuentaBancaria cuentaBancaria;
    public LibreCambista(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria=cuentaBancaria;
    }
    
    public void realizarConversion(String moneda1, String moneda2, Float amount){
        System.out.println("\nConversion Libre Cambistas:");
        cuentaBancaria.mostrarMontoActual();
        EmpresaCambioMoneda.getInstance().conversionDinero(moneda1,moneda2,amount);
        Float resultado = EmpresaCambioMoneda.getInstance()
        .conversionDinero(moneda1,moneda2,amount);
        if(moneda2.equals("dolar")){
            resultado = resultado*(float)7;
        }else if(moneda2.equals("euro")){
            resultado = resultado*(float)9;
        }
        cuentaBancaria
        .setDineroGuardado(cuentaBancaria.getDineroGuardado()+resultado);
        
        cuentaBancaria.mostrarCambios();
        }
    }
