package lista3filas5;
import java.io.*;
import java.util.*;
public class Result {
	public int trocas(Queue fila){
        int contadorTrocas = 0;
        if(fila.isEmpty()) return(contadorTrocas);
        int dadoForaFila = fila.dequeue();
        while(!fila.isEmpty()){
            int dadoComparacao = fila.head();
            if(dadoForaFila<dadoComparacao){
                fila.dequeue();
                ++contadorTrocas;
            } else{
                dadoForaFila = fila.dequeue();
            }
        }
        return(contadorTrocas);
    }
}
