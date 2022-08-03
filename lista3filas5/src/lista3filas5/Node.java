package lista3filas5;
import java.io.*;
import java.util.*;
public class Node {
	//=========Atributos=========
    private int dado;
    private Node proximo;
    //=========Construtores======
    public Node(){
        dado    = 0;
        proximo = null;
    }
    //---------------------------
    public Node(int d){
        dado    = d;
        proximo = null;
    }
    //=====Getters e Setters=====
    public int getDado(){
        return(dado);
    }
    //---------------------------
    public void setDado(int d){
        dado = d;
    }
    //---------------------------
    public Node getProximoNo(){
        return(proximo);
    }
    //---------------------------
    public void setProximoNo(Node no){
        proximo = no;
    }
}
