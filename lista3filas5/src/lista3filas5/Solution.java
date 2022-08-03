package lista3filas5;
import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String entrada = bufferedReader.readLine();
        Queue fila = new Queue();
        fila.receberString(entrada);
        Result result = new Result();
        bufferedWriter.write(String.valueOf(result.trocas(fila)));
//note que, a funcao trocas deve retornar um Integer, porem por um bug do hackerranks eh necessario transformalo em uma String
        bufferedReader.close();
        bufferedWriter.close();
    }
}
