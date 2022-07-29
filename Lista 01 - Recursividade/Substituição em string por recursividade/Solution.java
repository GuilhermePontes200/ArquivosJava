package lista1recursividade2;

import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String s = bufferedReader.readLine();

        String resultado = Result.trocaRecursiva(s);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
