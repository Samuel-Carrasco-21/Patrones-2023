package Ejercicio_Fila_B.Ejercicio5;

public class Division extends OperacionMatematica{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("/")){
            context.division = true;
            context.input=context.input.substring(1);
        }
    }
}
