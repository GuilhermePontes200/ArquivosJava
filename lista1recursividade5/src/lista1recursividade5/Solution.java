package lista1recursividade5;
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String numero = bufferedReader.readLine();
        Integer base = Integer.parseInt(bufferedReader.readLine());
        
        String resultado = Result.converterBase(numero,base);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
