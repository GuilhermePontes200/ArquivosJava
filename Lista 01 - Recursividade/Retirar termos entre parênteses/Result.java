package lista1recursividade1;

public class Result {
	public static boolean dentroParenteses;
    public static String encontrarTermos(String a) {
        if(a==null) return(null);
        String c = a.substring(0,1);
        if(c.equals("(")) dentroParenteses = true;
        if((Result.dentroParenteses==true)&&(c.equals(")"))) {
            Result.dentroParenteses = false;
            return(")");
        }
        if(Result.dentroParenteses) return(c+encontrarTermos(a.substring(1)));
        else return(encontrarTermos(a.substring(1)));
        
    }

}
