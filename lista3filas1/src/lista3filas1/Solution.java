package lista3filas1;
import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        CustomQueue queue = new CustomQueue();

        while(scan.hasNextLine()) {
            String nextLine = scan.nextLine();

            if(nextLine.isEmpty()) {
                break;
            }
         
            Integer n = Integer.parseInt(nextLine);
            
            if (n < 0) {
                queue.remove();
                System.out.println("Remove: " + queue.display());

            } else {
                queue.add(n);
                System.out.println("Insert: " + queue.display());
            }
        }
    }
}

