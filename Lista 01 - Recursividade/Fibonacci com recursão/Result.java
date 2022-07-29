package lista1recursividade3;

public class Result {
	public static String loop(Integer n) {
        if(n<0) return("");
        if(n==0) return(String.valueOf(fibonacci(0)));
        else return(loop(n-1)+","+String.valueOf(fibonacci(n)));
    }

    public static Integer fibonacci(Integer f) {
        if(f<0) return(0);
        if(f==0) return(0);
        if(f==1) return(1);
        return(fibonacci(f-1)+fibonacci(f-2));
    }
}
