package lista1recursividade4;

import java.util.*;
import java.io.*;
public class Solution {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        
	        String s = bufferedReader.readLine();

	        String resultado = Result.eliminacaoRecursiva(s);

	        bufferedWriter.write(resultado);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}
