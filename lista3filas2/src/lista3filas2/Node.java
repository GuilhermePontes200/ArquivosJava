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
public class Node<T> {
	//=========Atributos============
    private T dado;
    private Node<T> proximo;
    //=========Construtores=========
    public Node(){
        this.dado    = null;
        this.proximo = null;
    }
    //------------------------------
    public Node(T d){
        this.dado    = d;
        this.proximo = null;
    }
    //=======Getters e Setters======
    public T getDado(){
        return(this.dado);
    }
    //------------------------------
    public void setDado(T d){
        this.dado = d;
    }
    //------------------------------
    public Node getProximoNo(){
        return(this.proximo);
    }
    //------------------------------
    public void setProximoNo(Node no){
        this.proximo = no;
    }
}
