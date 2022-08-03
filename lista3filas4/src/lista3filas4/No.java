package lista3filas4;
import java.io.*;
import java.util.*;
public class No<T> {
	//==========Atributos============
    private T dado;
    private No  proximo;
    //==========Construtores=========
    public No(){
       dado = null;
       proximo = null;
    } 
    //------------------------------- 
    public No(T d){
       dado    = d;
       proximo = null;
    }
    //========Getters e Setters====== 
    public T getDado(){
       return(this.dado);
    }
    //------------------------------- 
    public void setDado(T d){
       this.dado = d;
    }
    //------------------------------- 
    public No getProximoNo(){
       return(this.proximo);
    }
    //------------------------------- 
    public void setProximoNo(No no){
       this.proximo = no;
    }
}
