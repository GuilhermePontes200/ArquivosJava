package lista3filas5;
import java.io.*;
import java.util.*;
public class Queue {
	//========Atributos==============
    private Node topo;
    //========Construtores===========
    public Queue(){
        topo = null;
    }
    //========Metodos================
    public void enqueue(int n){
        Node novoNo = new Node(n);
        if(this.topo==null){
            this.topo = novoNo;
            return;
        }
        Node noAtual = this.topo;
        while(noAtual.getProximoNo()!=null) noAtual = noAtual.getProximoNo();
        noAtual.setProximoNo(novoNo);
    }
    //-------------------------------
    public int dequeue(){
        if(this.topo==null) return(-1);
        int dado = this.topo.getDado();
        this.topo = this.topo.getProximoNo();
        return(dado);
    }
    //-------------------------------
    public int head(){
        if(this.topo==null) return(-1);
        return(this.topo.getDado());
    }
    //-------------------------------
    public boolean isEmpty(){
        if(this.topo==null) return(true); else return(false);
    }
    //-------------------------------
    public void receberString(String entrada) {
       for (String valoresStr: entrada.split(";")) this.enqueue(Integer.parseInt(valoresStr));
    }
}
