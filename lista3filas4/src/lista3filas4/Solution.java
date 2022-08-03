package lista3filas4;
import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine().trim());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        int c = Integer.parseInt(bufferedReader.readLine().trim());

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        int e = Integer.parseInt(bufferedReader.readLine().trim());

        int f = Integer.parseInt(bufferedReader.readLine().trim());
        
        int g = Integer.parseInt(bufferedReader.readLine().trim());
        
        int h = Integer.parseInt(bufferedReader.readLine().trim());
        
        int i = Integer.parseInt(bufferedReader.readLine().trim());
        
        int j = Integer.parseInt(bufferedReader.readLine().trim());

        Fila<Integer> estudantes = new Fila<>();
        
        Fila<Integer> sanduiches = new Fila<>();
        
        estudantes.enqueue(a);
        estudantes.enqueue(b);
        estudantes.enqueue(c);
        estudantes.enqueue(d);
        estudantes.enqueue(e);
        
        sanduiches.enqueue(f);
        sanduiches.enqueue(g);
        sanduiches.enqueue(h);
        sanduiches.enqueue(i);
        sanduiches.enqueue(j);
        
        int resultado = Result.contarEstudantes(estudantes, sanduiches);
        
        System.out.println(resultado);

        bufferedReader.close();
    }
}
