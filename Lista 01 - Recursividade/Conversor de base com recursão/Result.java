package lista1recursividade5;

public class Result {
	public static String converterBase(String numero, int base){
        int n = Integer.parseInt(numero);
        if(n==0) return("");
        int quociente = n/base; //divisao inteira
        int resto = n%base;
        if(resto<10) return(converterBase(String.valueOf(quociente),base)+String.valueOf(resto));
        else return(converterBase(String.valueOf(quociente),base)+String.format ("%c", 'A' + (resto-10)));
    }

}
