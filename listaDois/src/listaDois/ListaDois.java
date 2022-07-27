package listaDois;

/**
 * Respostas das quest�es relativas � segunda lista de LPOO - 2021.2
 * @professor Professor Bruno Jos� Torres Fernandes
 * @author Guilherme Pontes de Oliveira Lima
 */
/**
 * @author Guilherme Pontes de Oliveira Lima
 *
 */
import java.util.Scanner;
public class ListaDois {
	//=================Implementa��o da Quest�o 1 da Lista 2 de LPOO=================
	public static void explicadoMain(String chave) {
		String mensagemPublic = "O modificador 'public' em Java indica que, o m�todo pode ser chamado por qualquer c�digo interno ou externo � classe na qual foi definido";
		String mensagemStatic = "O modificador 'static' em Java indica que o m�todo pertence � classe e pode ser chamado em suas inst�ncias ou mesmo sem inst�nciamento";
		String mensagemvoid   = "O modificador 'void' em Java indica que o m�todo n�o retorna nenhum valor, ou seja, � um procedimento e n�o uma fun��o";
		switch(chave)
        {
            case "public":
                System.out.println(mensagemPublic);
                break;
            case "static":
                System.out.println(mensagemStatic);
                break;
            case "void":
                System.out.println(mensagemvoid);
                break;
            default:
                System.out.println("Op��o n�o dispon�vel");
        }
	}
	//=========================RESPOSTA DA 2A QUEST�O==============================
	/* Para o valor de y = 1, ser� criada uma vari�vel LOCAL x na fun��o incrementarEDobrar
     * ao valor desta vari�vel ser� ent�o atribuido "1" logo na express�o x = (x+1)*2 teremos
     * x recebendo (1+1)*2 = 4 que ser�, portanto, o valor retornado.
     * 
     * O valor de y passado como argumento da fun��o N�O SER� MODIFICADO pois a vari�vel x
     * da fun��o � local e n�o vai sobrescrever o valor da vari�vel externa a fun��o (a chamada
     * em Java � por valor e n�o por refer�ncia).
     * 
     * No c�digo dado, y=1; a fun��o incrementarEDobrar(y) retorna 4 (este valor n�o � usado pelo
     * programa e fica, portanto, perdido); o valor impresso em System.out.println("y = "+y);
     * ser� o valor de y que PERMANECE igual ao seu valor original "1".
     * 
     * O valor impresso � "y = 1" e n�o h� erro de sintaxe. Talvez o comportamento desejado pelo
     * programador seria a mudan�a da vari�vel y e, neste caso, ter�amos um erro de l�gica pois
     * o programador esperava uma chamada por refer�ncia mas implementou uma chamada por valor.
	 */
	//=========================RESPOSTA DA 2A QUEST�O==============================
	public static void questao3() {
		Scanner scanQ3= new Scanner(System.in);
		Numpy np = new Numpy(); //Inst�ncia a classe Numpy
		int N = 5; //A quest�o pede que o array tenha 5 elementos. Criei um inteiro para que as mudan�as, se houverem, nessa condi��o possam ser centralizadas todas aqui.
		int[] elementos = new int[N]; //Inst�ncia um vetor/array de inteiros com N elementos
		int X; //um elemento particular da array
		do{
			System.out.println("Escolha uma das op��es abaixo:\n");
			System.out.println("\t1.Inserir um novo vetor");
			System.out.println("\t2.Visualizar o �ltimo valor, sem remover da lista. (pop)");
			System.out.println("\t3.visualizar o maior valor. (max)");
			System.out.println("\t4.visualizar a soma dos valores. (sum)");
			System.out.println("\t5.visualizar a m�dia dos valores. (mean)");
			System.out.println("\t6.Sair (Digitar qualquer resposta diferente de 1 � 5 tamb�m finaliza a quest�o)");
			String resposta=scanQ3.nextLine();
			switch(resposta)
	        {
	            case "1":
	                System.out.println("\t\t---Entre com os elementos do array (um por vez)---");
	                int i=0;
	                while(i<N) { //Aqui iremos simular um la�o for. O incremento de i ser� feito apenas no caso de um valor adequado fornecido ao array
	                	System.out.println("\t\t\t> Entre com o elemento "+(i+1)+" de "+N+" do array:");
	                	resposta=scanQ3.nextLine(); //lendo a resposta como uma string
	                	try{
	                        X = Integer.parseInt(resposta);
	                    }
	                    catch (NumberFormatException ex){ //Se o usu�rio n�o digitou um inteiro, pede novamente os dados
	                    	System.out.println("\t\t\t> Resposta inv�lida. Entre novamente com o valor");
	                    	continue; // passa para a pr�xima itera��o sem incrementar i
	                    }
	                	elementos[i] = X;
	                	i++;
	                };
	                
	                //imprimindo o vetor (comentar se desnecess�rio)
	                System.out.print("\t\t\t> Vetor inserido: [");
	                for(int j=0;j<N-1;++j) System.out.print(elementos[j]+" , ");
	                System.out.println(elementos[N-1]+"]");
	                break;
	            case "2":
	                System.out.println("\t\t>>> O �ltimo valor do array � " + np.pop(elementos));
	                break;
	            case "3":
	            	System.out.println("\t\t>>> O maior valor do array � " + np.max(elementos));
	                break;
	            case "4":
	            	System.out.println("\t\t>>> A soma dos elementos do array � " + np.sum(elementos));
	                break;
	            case "5":
	            	System.out.println("\t\t>>> A m�dia (int) dos elementos do array � " + np.mean(elementos));
	                break;
	            default:
	                return;
	        }
		}while(true);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("=========Quest�o 1/Lista 2=========\n");
		do {
			System.out.println("Entre com a palavra chave desejada ou N para sair");
			String chave= scan.nextLine();
			if( ("N".equals(chave)||("n".equals(chave))) ) break;
			explicadoMain(chave);
		}while(true);
		System.out.println("===================================\n");
		
		/*
		 * System.out.println("=========Quest�o 2/Lista 2=========\n"); 
		 * Calculadora calc = new Calculadora(); 
		 * int y=1; 
		 * System.out.println("y = "+y);
		 * System.out.println(calc.incrementarEDobrar(y)); 
		 * System.out.println("y = "+y);
		 */
		
		System.out.println("=========Quest�o 3/Lista 2=========\n");
		questao3();
		System.out.println("===================================\n");
		scan.close();
	}
}