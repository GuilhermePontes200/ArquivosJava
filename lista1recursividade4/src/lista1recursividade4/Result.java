package lista1recursividade4;

public class Result {
	public static String eliminacaoRecursiva(String s) {
        if ((s == null) || (s.length() <= 1)){
        return s;
        } else if (s.charAt(0) == s.charAt(1)) {
        return ""+eliminacaoRecursiva(s.substring(1));    
        }
        return s.charAt(0)+eliminacaoRecursiva(s.substring(1));
	}
}
