package listaDois;

/**
 * Respostas das questões relativas à segunda lista de LPOO - 2021.2
 * @professor Professor Bruno José Torres Fernandes
 * @author Guilherme Pontes de Oliveira Lima
 */
/**
 * @author Guilherme Pontes de Oliveira Lima
 *
 */
import java.util.Scanner;
public class ListaDois {
	//=================Implementação da Questão 1 da Lista 2 de LPOO=================
	public static void explicadoMain(String chave) {
		String mensagemPublic = "O modificador 'public' em Java indica que, o método pode ser chamado por qualquer código interno ou externo à classe na qual foi definido";
		String mensagemStatic = "O modificador 'static' em Java indica que o método pertence à classe e pode ser chamado em suas instâncias ou mesmo sem instânciamento";
		String mensagemvoid   = "O modificador 'void' em Java indica que o método não retorna nenhum valor, ou seja, é um procedimento e não uma função";
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
                System.out.println("Opção não disponível");
        }
	}
	//=========================RESPOSTA DA 2A QUESTÃO==============================
	/* Para o valor de y = 1, será criada uma variável LOCAL x na função incrementarEDobrar
     * ao valor desta variável será então atribuido "1" logo na expressão x = (x+1)*2 teremos
     * x recebendo (1+1)*2 = 4 que será, portanto, o valor retornado.
     * 
     * O valor de y passado como argumento da função NÃO SERÁ MODIFICADO pois a variável x
     * da função é local e não vai sobrescrever o valor da variável externa a função (a chamada
     * em Java é por valor e não por referência).
     * 
     * No código dado, y=1; a função incrementarEDobrar(y) retorna 4 (este valor não é usado pelo
     * programa e fica, portanto, perdido); o valor impresso em System.out.println("y = "+y);
     * será o valor de y que PERMANECE igual ao seu valor original "1".
     * 
     * O valor impresso é "y = 1" e não há erro de sintaxe. Talvez o comportamento desejado pelo
     * programador seria a mudança da variável y e, neste caso, teríamos um erro de lógica pois
     * o programador esperava uma chamada por referência mas implementou uma chamada por valor.
	 */
	//=========================RESPOSTA DA 2A QUESTÃO==============================
	public static void questao3() {
		Scanner scanQ3= new Scanner(System.in);
		Numpy np = new Numpy(); //Instância a classe Numpy
		int N = 5; //A questão pede que o array tenha 5 elementos. Criei um inteiro para que as mudanças, se houverem, nessa condição possam ser centralizadas todas aqui.
		int[] elementos = new int[N]; //Instância um vetor/array de inteiros com N elementos
		int X; //um elemento particular da array
		do{
			System.out.println("Escolha uma das opções abaixo:\n");
			System.out.println("\t1.Inserir um novo vetor");
			System.out.println("\t2.Visualizar o último valor, sem remover da lista. (pop)");
			System.out.println("\t3.visualizar o maior valor. (max)");
			System.out.println("\t4.visualizar a soma dos valores. (sum)");
			System.out.println("\t5.visualizar a média dos valores. (mean)");
			System.out.println("\t6.Sair (Digitar qualquer resposta diferente de 1 à 5 também finaliza a questão)");
			String resposta=scanQ3.nextLine();
			switch(resposta)
	        {
	            case "1":
	                System.out.println("\t\t---Entre com os elementos do array (um por vez)---");
	                int i=0;
	                while(i<N) { //Aqui iremos simular um laço for. O incremento de i será feito apenas no caso de um valor adequado fornecido ao array
	                	System.out.println("\t\t\t> Entre com o elemento "+(i+1)+" de "+N+" do array:");
	                	resposta=scanQ3.nextLine(); //lendo a resposta como uma string
	                	try{
	                        X = Integer.parseInt(resposta);
	                    }
	                    catch (NumberFormatException ex){ //Se o usuário não digitou um inteiro, pede novamente os dados
	                    	System.out.println("\t\t\t> Resposta inválida. Entre novamente com o valor");
	                    	continue; // passa para a próxima iteração sem incrementar i
	                    }
	                	elementos[i] = X;
	                	i++;
	                };
	                
	                //imprimindo o vetor (comentar se desnecessário)
	                System.out.print("\t\t\t> Vetor inserido: [");
	                for(int j=0;j<N-1;++j) System.out.print(elementos[j]+" , ");
	                System.out.println(elementos[N-1]+"]");
	                break;
	            case "2":
	                System.out.println("\t\t>>> O último valor do array é " + np.pop(elementos));
	                break;
	            case "3":
	            	System.out.println("\t\t>>> O maior valor do array é " + np.max(elementos));
	                break;
	            case "4":
	            	System.out.println("\t\t>>> A soma dos elementos do array é " + np.sum(elementos));
	                break;
	            case "5":
	            	System.out.println("\t\t>>> A média (int) dos elementos do array é " + np.mean(elementos));
	                break;
	            default:
	                return;
	        }
		}while(true);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("=========Questão 1/Lista 2=========\n");
		do {
			System.out.println("Entre com a palavra chave desejada ou N para sair");
			String chave= scan.nextLine();
			if( ("N".equals(chave)||("n".equals(chave))) ) break;
			explicadoMain(chave);
		}while(true);
		System.out.println("===================================\n");
		
		/*
		 * System.out.println("=========Questão 2/Lista 2=========\n"); 
		 * Calculadora calc = new Calculadora(); 
		 * int y=1; 
		 * System.out.println("y = "+y);
		 * System.out.println(calc.incrementarEDobrar(y)); 
		 * System.out.println("y = "+y);
		 */
		
		System.out.println("=========Questão 3/Lista 2=========\n");
		questao3();
		System.out.println("===================================\n");
		scan.close();
	}
}