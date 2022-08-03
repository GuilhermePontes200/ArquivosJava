package lista3filas1;
import java.io.*;
import java.util.*;
public class CustomQueue {
	//=======Atributos===========
    private Node topo;
    //=======Construtores========
    public CustomQueue(){
        topo = null;
    }
    //=======Metodos=============
    public void add(int n){
        //Criando novo dado
        Node novoNo = new Node(n);
        if(this.topo==null) this.topo = novoNo;
        else{
            Node noatual = this.topo;
            while(noatual.getProximoNo()!=null) noatual = noatual.getProximoNo();
            noatual.setProximoNo(novoNo);
        }
    }
    //---------------------------
    public int remove(){
        if(this.topo==null) return 0;
        int n = this.topo.getDado();
        topo = topo.getProximoNo();
        return(n);
    }
    //---------------------------
    public String display() {
       if(topo==null) return("Empty");
       Node noatual = topo;
       String str=Integer.toString(noatual.getDado());
       noatual=noatual.getProximoNo();
       while(noatual!=null){
           str = str +" "+ Integer.toString(noatual.getDado());
           noatual=noatual.getProximoNo();
       }
       return(str);
    }
}
//================================================================

