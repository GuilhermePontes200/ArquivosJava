package lista3filas3;
import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        int b = Integer.parseInt(bufferedReader.readLine());

        int c = Integer.parseInt(bufferedReader.readLine());

        int d = Integer.parseInt(bufferedReader.readLine());

        int e = Integer.parseInt(bufferedReader.readLine());

        int f = Integer.parseInt(bufferedReader.readLine());
        
        int n = Integer.parseInt(bufferedReader.readLine());

        Fila<Integer> oFilas = new Fila<>();
        oFilas.enqueue(a);
        oFilas.enqueue(b);
        oFilas.enqueue(c);
        oFilas.enqueue(d);
        oFilas.enqueue(e);
        oFilas.enqueue(f);
        
        oFilas.inverterFila(n);
        
        oFilas.print();

        bufferedReader.close();
    }
}
