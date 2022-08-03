package lista3filas3;
import java.io.*;
import java.util.*;
public class No<T> {
	//==========Atributos============ 
	   private T dado;
	   private No<T> proximo;
	   //==========Construtores=========
	   public No(){
	       this.dado = null;
	       this.proximo = null;
	   }
	   //-------------------------------
	   public No(T d){
	       this.dado    = d;
	       this.proximo = null;
	   } 
	   //=====Getters e Setters=========
	   public T getDado(){
	       return(this.dado);
	   }
	   //------------------------------- 
	   public void setDado(T d){
	       this.dado = d;
	   } 
	   //------------------------------- 
	   public No   getProximoNo(){
	       return(this.proximo);
	   } 
	   //------------------------------- 
	   public void setProximoNo(No no){
	       this.proximo = no;
	   }
}
