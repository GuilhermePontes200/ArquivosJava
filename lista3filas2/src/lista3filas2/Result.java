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
public class Result {
	public static String toBinary(int N){
        String binario = "";
        int quociente = N;
        int resto = 0;
        while(quociente!=0){
            resto = quociente%2;
            quociente = quociente/2;
            binario = Integer.toString(resto)+binario;
        }
        return(binario);
    }
    //----------------------------------------------------
    public static Queue<String> binaryNumbers(int n){
        Queue<String> fila = new Queue<String>();
        for(int i=1;i<=n;i++) fila.enqueue(toBinary(i));
        return(fila);
    }
}
