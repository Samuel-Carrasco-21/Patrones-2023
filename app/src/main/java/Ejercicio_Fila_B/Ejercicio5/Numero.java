package Ejercicio_Fila_B.Ejercicio5;

public class Numero  extends OperacionMatematica {
    public Numero(int digit){
        this.digit=digit;
    }

    @Override
    public void interpreter(Context context) {
        context.output = 
        context.division ? context.output / Integer.parseInt(context.input.substring(0,this.digit))
            : context.output+Integer.parseInt(context.input.substring(0,this.digit));

        context.division = context.division ? false : context.division;

        context.input = context.input.substring(this.digit);
    }

}
