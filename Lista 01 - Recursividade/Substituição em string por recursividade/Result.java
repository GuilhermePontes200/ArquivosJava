package lista1recursividade2;

public class Result {
	public static String trocaRecursiva(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\,","");
        s = s.replaceAll(" ","");
        s = s.replaceAll("pi","3.14");
        if ((s == null) || (s.length() <= 1)){
        return s;
        }
        return s.charAt(0)+trocaRecursiva(s.substring(1));
    }
}
