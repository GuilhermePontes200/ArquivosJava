package lista3filas4;
import java.io.*;
import java.util.*;
public class Fila<T> {
	//==========Atributos============
    private No<T> topo;
    private int tam;
    //==========Construtores=========
    public Fila(){
        topo = null;
        tam  = 0;
    }
    //==========Metodos==============
    public int getTamanhoFila(){
        return(tam);
    }
    //-------------------------------
    public void enqueue(T novoDado){
        ++tam;
        No<T> novoNo = new No<T>(novoDado);
        if(topo==null){
            topo = novoNo;
            return;
        }else{
            No<T> noatual = topo;
            while(noatual.getProximoNo()!=null) noatual = noatual.getProximoNo();
            noatual.setProximoNo(novoNo);
            return;
        }
    }
    //-------------------------------
    public T dequeue(){
        if(topo==null) return(null);
        T dado = topo.getDado();
        topo = topo.getProximoNo();
        --tam;
        return(dado);
    }
    //-------------------------------
    public T head(){//devolve o topo sem tirar da fila
        if(topo==null) return(null);
        T dado = topo.getDado();
        return(dado);
    }
    //--------------------------------
    public boolean ehUniforme(){
        //Retorna true se todos os dados forem de um mesmo tipo
        if(topo==null) return(true);
        No<T> noatual = topo;
        T dadoTopo = topo.getDado();
        while(noatual.getProximoNo()!=null){
          noatual = noatual.getProximoNo();
          if(noatual.getDado()!=dadoTopo) return(false);
        } 
        return(true);
    }
}
