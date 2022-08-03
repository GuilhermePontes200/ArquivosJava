package lista3filas2;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Queue<T> {
	//==========Atributos===========
    private Node<T> topo;
    //==========Construtores========
    Queue(){
        topo = null;
    }
    //==========Metodos=============
    public void enqueue(T dado){
        Node no = new Node(dado);
        if(this.topo == null){
            topo = no;
            return;
        } 
        Node noAtual = topo;
        while(noAtual.getProximoNo()!=null) noAtual = noAtual.getProximoNo();
        noAtual.setProximoNo(no);
    }
    //-------------------------------
    public T dequeue(){
        if(this.topo==null) return(null);
        T dado = topo.getDado();
        this.topo = this.topo.getProximoNo();
        return(dado);
    }
    //-------------------------------
    public void print(){
        if(this.topo==null) return;
        Node noAtual = topo;
        System.out.print(noAtual.getDado());
        noAtual = noAtual.getProximoNo();
        while(noAtual!=null){
            System.out.print(" "+noAtual.getDado());
            noAtual = noAtual.getProximoNo();
        }
    }
}
