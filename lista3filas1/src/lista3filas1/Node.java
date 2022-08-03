package lista3filas1;

import java.io.*;
import java.util.*;
public class Node {
	//=======Atributos===========
    private int dado;
    private Node proximo;
    //=======Construtores========
    public  Node(){
        dado    = 0;
        proximo = null;
    }
    //---------------------------
    public  Node(int d){
        dado    = d;
        proximo = null;
    }
    //---------------------------
    public  Node(int d, Node no){
        dado    = d;
        proximo = no;
    }
    //==== Getters e Setters====
    public  int  getDado(){
        return(this.dado);
    }
    //---------------------------
    public  void setDado(int d){
        this.dado = d;   
    }
    //---------------------------
    public  Node getProximoNo(){
        return(proximo);
    }
    //---------------------------
    public  void setProximoNo(Node no){
        proximo = no;
    }
    //---------------------------
}

