package lista3filas4;
import java.io.*;
import java.util.*;
public class Result {
	public static int contarEstudantes(Fila<Integer> estudantes, Fila<Integer> sanduiches){
        //Os criterios de parada sao a fila de sanduiches ficar vazia OU
        //A fila de estudantes for uniforme (todos de mesmo tipo) mas o primeiro elemento 
        //na fila de sanduiches for de tipo diferente dos estudantes na fila
        while(true){
            if(sanduiches.getTamanhoFila()==0) return(estudantes.getTamanhoFila());
            if(estudantes.getTamanhoFila()==0) return(0); //Nao ha estudantes sem sanduiche
            int tipoEstudantes = estudantes.head();
            int tipoSanduiches = sanduiches.head();
            if(tipoEstudantes==tipoSanduiches){
                estudantes.dequeue();
                sanduiches.dequeue();
            }else{
                estudantes.dequeue();
                estudantes.enqueue(tipoEstudantes);
                if(estudantes.ehUniforme()) return(estudantes.getTamanhoFila()); //Todos estudantes de mesmo tipo com 
                                                                    //sanduiche incompativel
            }
        }
    }
}
