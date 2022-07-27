/**
 * 
 */
package listaUm;

/**
 * @author guilherme
 *
 */
import java.util.Scanner; //Pacote para entrada de dados via teclado
public class ListaUm {
	//========Explicação da Questão 1=======
	//As variáveis foram inicializadas com valores impossíveis para a questão pedida de forma a identificar fácilmente se as operações estão ou
	//não sendo apropriadamente executadas e os loops "for" dividem a variável contador em dois e a somam a um de forma a somente executar o loop
	//até encontrar os números relevantes para determinação da mediana.
	public static double questao1(int contador){
		double f_n_menos_um   = -1; //Inicializando com valores que facilitam o rastreamento de erros
		double f_n_menos_dois = -1; //Inicializando com valores que facilitam o rastreamento de erros
		double f_atual = -1;        //Inicializando com valores que facilitam o rastreamento de erros
		if(contador<=0) {
			//System.out.println("O valor do contador tem de ser um número positivo. O valor retornado (-1) é um indicativo de erro");
			return(-1.0);
		}
		else if(contador==1) return(0.0); //Sequência {0}
		else if(contador==2) return(0.5); //Sequência {0,1}
		else if(contador%2!=0) {//O contador é ímpar e a mediana é um elemento da própria sequência
			//Gerando a sequência até onde necessário
			f_n_menos_um   = 1;
			f_n_menos_dois = 0;
			for(int n=2;n<(1+contador)/2;n++) {
				f_atual = f_n_menos_um + f_n_menos_dois;
				f_n_menos_dois = f_n_menos_um;
				f_n_menos_um   = f_atual;
			}
			return(f_atual);
		} else {//O contador é par e a mediana é a média de dois elementos da própria sequência
			//Gerando a sequência até onde necessário
			f_n_menos_um   = 1;
			f_n_menos_dois = 0;
			for(int n=2;n<1+contador/2;n++) {
				f_atual = f_n_menos_um + f_n_menos_dois;
				f_n_menos_dois = f_n_menos_um;
				f_n_menos_um   = f_atual;
			}
			return(0.5*(f_n_menos_um+f_n_menos_dois));
		}
	}
	//========Resposta da Questão 2========
	// Em minha opinião, a linguagem Java tem como vantagem ter tipos fortes e de declaração explicita como o C/C++ 
	//(o python infere os tipos o que pode levar a erros lógicos bem complicados de rastrear) sem a desvantagem do C/C++ de
	//depender de ponteiros que podem ser usados para violar esses tipos dando margem aos mesmos erros lógicos de difícil rastreamento. 
	//=====================================
	
	//========Explicação da Questão 3=======
	//Eu criei variáveis para idade inicial e para o redutor da idade pois se no futuro esses parâmetros mudarem , eu teria de alterar
	//apenas aquelas linhas iniciais do código. De resto, o código segue a lógica da questão com uso simples dos condicionais.
	static boolean vacinado(int idade, boolean comorbidade) {
		int idadeInicial = 54;
		int idadeFinal   = 85;
		int redutorIdade = 8;
		if(comorbidade) idadeInicial = idadeInicial - redutorIdade;
		if((idade>idadeInicial)&&(idade<=idadeFinal)) return(true);
		return(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste das funcões implementadas
		int numeroTermos = -1; //inicializando as variáveis com valores indicadores de erro fáceis de rastrear
		double mediana = -1.0; //inicializando as variáveis com valores indicadores de erro fáceis de rastrear
		Scanner leitor = new Scanner(System.in);
		String resposta;
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("Testando a Questão 1");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		do {
			System.out.println("*************************************************************************************************************");
			System.out.println("Para o teste da Questão 1, entre com o número de termos da sequência de Fibonacci para o cálculo da mediana");
			System.out.println("Para finalizar, entre com um número de termos menor ou igual a zero");
			System.out.print("Número de termos da sequência: ");
			//leitor 
			resposta = leitor.next();
			numeroTermos = Integer.parseInt(resposta);
			mediana = questao1(numeroTermos);
			if(mediana>=0) System.out.println("A mediana da sequência com "+numeroTermos+" termos é "+ mediana);
		}while(numeroTermos>0);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("Teste da Questão 1 finalizado. Testando a Questão 3:");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		int idade = -1; //inicializando as variáveis com valores indicadores de erro fáceis de rastrear		
		do {
			System.out.println("*************************************************************************************************************");
			System.out.println("Para o teste da Questão 3, entre com a idade do paciente");
			System.out.println("Para finalizar, entre com uma idade menor ou igual a zero");
			System.out.print("Idade do indivíduo: ");
			resposta = leitor.next();
			idade = Integer.parseInt(resposta);
			System.out.print("O indivíduo apresenta comorbidade (S/N)? ");
			leitor = new Scanner(System.in);
			resposta = leitor.next();
			boolean elegivel = false; //determinando se o indivíduo é ou não elegível para vacinação
			if(("S".equals(resposta))||("s".equals(resposta))) elegivel = vacinado(idade,true); else elegivel = vacinado(idade, false);	
			if(elegivel) {
				if(("S".equals(resposta))||("s".equals(resposta)))
					System.out.println("\nO indivíduo de idade "+idade+" apresenta comorbidade e é elegível para vacinação\n");
				else
					System.out.println("\nO indivíduo de idade "+idade+" NÃO apresenta comorbidade é elegível para vacinação\n");
			} else {
				if(("S".equals(resposta))||("s".equals(resposta)))
					System.out.println("\nO indivíduo de idade "+idade+" apresenta comorbidade e é NÃO elegível para vacinação\n");
				else
					System.out.println("\nO indivíduo de idade "+idade+" NÃO apresenta comorbidade e NÃO é elegível para vacinação\n");
			}
		}while(idade>0);
		leitor.close();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("Teste da Questão 3 finalizado. Fechando o programa");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

}
