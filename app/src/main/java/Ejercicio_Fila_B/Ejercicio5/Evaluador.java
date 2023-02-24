package Ejercicio_Fila_B.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends OperacionMatematica{
    private List<OperacionMatematica> formula = new ArrayList<>();
    private Context context;

    public Evaluador(String formulaOriginal){
        context = new Context(formulaOriginal.replace(" ",""));
        for (String msg:formulaOriginal.split(" ")){
            switch (msg){
                case "+":
                    formula.add(new Suma());
                    break;
                case "/":
                    formula.add(new Division());
                    break;
                default:
                    formula.add(new Numero(msg.length()));
                    break;
            }
        }
    }

    public int evaluateFormula(){
        for (OperacionMatematica operacionMatematicas:formula) {
            operacionMatematicas.interpreter(context);
        }
        return context.output;
    }
    @Override
    public void interpreter(Context context) {}
}
