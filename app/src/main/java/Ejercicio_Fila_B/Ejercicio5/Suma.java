package Ejercicio_Fila_B.Ejercicio5;

public class Suma extends OperacionMatematica{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.division = false;
            context.input=context.input.substring(1);
        }
    }
}
