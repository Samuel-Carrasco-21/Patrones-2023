package Ejercicios_Fila_B_2.Ejercicio4;

import java.util.Vector;

public class Estrategia2 implements IStrategy{
    public static void merge(Vector<Estudiante> vector,
        int left,
        int middle, 
        int right){

        int leftVectorSize = middle - left + 1;
        int rightVectorSize = right - middle;

        Vector<Estudiante> leftVector = new Vector<>();
        Vector<Estudiante> rightVector = new Vector<>();

        for(int i=0;i<leftVectorSize;i++){
            leftVector.add(vector.get(left+i));
        }

        for(int j=0;j<rightVectorSize;j++){
            rightVector.add(vector.get(j + middle + 1));
        }

        int i = 0;
        int j = 0;

        int k = left;
        while(i < leftVectorSize && j < rightVectorSize){
            if(leftVector.get(i).getInitialChar() <= rightVector.get(j).getInitialChar()){
                vector.set(k, leftVector.get(i));
                i++;
            }else{
                vector.set(k, rightVector.get(j));
                j++;
            }
            k++;
        }

        while(i<leftVectorSize){
            vector.set(k, leftVector.get(i));
            i++;
            k++;
        }

        while(j<rightVectorSize){
            vector.set(k, rightVector.get(j));
            j++;
            k++;
        }

    }

    public static Vector<Estudiante> sortList(Vector<Estudiante> vector,
    int left,
    int right){
        if(left < right){
            int middle = (left + (right - 1))/2;
            sortList(vector, left, middle);
            sortList(vector, middle+1, right);

            merge(vector,left,middle,right);
        }
        return vector;
    }

    @Override
    public void execute(Vector<Estudiante> estudiantesList) {
        sortList(estudiantesList, 0, estudiantesList.size()-1)
        .forEach(i->i.info());
    }
    
}
