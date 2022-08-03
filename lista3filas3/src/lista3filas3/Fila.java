package lista3filas3;
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
    //===========Metodos============= 
    public void print(){
        // Metodo para imprimir a fila.
        if(topo==null) return;
        No<T> noatual = topo;
        System.out.print(noatual.getDado());
        while(noatual.getProximoNo()!=null){
            noatual = noatual.getProximoNo();
            System.out.print(" "+noatual.getDado());
        }
    }
    //--------------------------------
    public T dequeue(){
        if(this.topo==null) return(null);
        T dado = this.topo.getDado();
        topo = this.topo.getProximoNo();
        --this.tam;
        return(dado);
    }
    //--------------------------------
    public void enqueue(T novodado){
        No<T> novoNo = new No<T>(novodado);
        if(this.topo==null) {
            this.topo = novoNo;
            return;
        }
        No<T> dadoAtual = this.topo;
        while(dadoAtual.getProximoNo()!=null) dadoAtual = dadoAtual.getProximoNo();
        dadoAtual.setProximoNo(novoNo);
        ++this.tam;
        return;
    }
    //--------------------------------
    public void recursao(int n){
        if(n==0) return;
        T dado = this.dequeue();
        this.recursao(n-1);
        this.enqueue(dado);
    }
    //--------------------------------
    public int getTamanhoFila(){
        return(this.tam);
    }
    //--------------------------------
    public void inverterFila(int n) {
        this.recursao(n);
        for(int i=0;i<=this.getTamanhoFila()-n;++i) this.enqueue(this.dequeue());
    }
}
