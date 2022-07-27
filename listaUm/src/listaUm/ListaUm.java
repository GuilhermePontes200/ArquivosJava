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
	//========Explica��o da Quest�o 1=======
	//As vari�veis foram inicializadas com valores imposs�veis para a quest�o pedida de forma a identificar f�cilmente se as opera��es est�o ou
	//n�o sendo apropriadamente executadas e os loops "for" dividem a vari�vel contador em dois e a somam a um de forma a somente executar o loop
	//at� encontrar os n�meros relevantes para determina��o da mediana.
	public static double questao1(int contador){
		double f_n_menos_um   = -1; //Inicializando com valores que facilitam o rastreamento de erros
		double f_n_menos_dois = -1; //Inicializando com valores que facilitam o rastreamento de erros
		double f_atual = -1;        //Inicializando com valores que facilitam o rastreamento de erros
		if(contador<=0) {
			//System.out.println("O valor do contador tem de ser um n�mero positivo. O valor retornado (-1) � um indicativo de erro");
			return(-1.0);
		}
		else if(contador==1) return(0.0); //Sequ�ncia {0}
		else if(contador==2) return(0.5); //Sequ�ncia {0,1}
		else if(contador%2!=0) {//O contador � �mpar e a mediana � um elemento da pr�pria sequ�ncia
			//Gerando a sequ�ncia at� onde necess�rio
			f_n_menos_um   = 1;
			f_n_menos_dois = 0;
			for(int n=2;n<(1+contador)/2;n++) {
				f_atual = f_n_menos_um + f_n_menos_dois;
				f_n_menos_dois = f_n_menos_um;
				f_n_menos_um   = f_atual;
			}
			return(f_atual);
		} else {//O contador � par e a mediana � a m�dia de dois elementos da pr�pria sequ�ncia
			//Gerando a sequ�ncia at� onde necess�rio
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
	//========Resposta da Quest�o 2========
	// Em minha opini�o, a linguagem Java tem como vantagem ter tipos fortes e de declara��o explicita como o C/C++ 
	//(o python infere os tipos o que pode levar a erros l�gicos bem complicados de rastrear) sem a desvantagem do C/C++ de
	//depender de ponteiros que podem ser usados para violar esses tipos dando margem aos mesmos erros l�gicos de dif�cil rastreamento. 
	//=====================================
	
	//========Explica��o da Quest�o 3=======
	//Eu criei vari�veis para idade inicial e para o redutor da idade pois se no futuro esses par�metros mudarem , eu teria de alterar
	//apenas aquelas linhas iniciais do c�digo. De resto, o c�digo segue a l�gica da quest�o com uso simples dos condicionais.
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
		// Teste das func�es implementadas
		int numeroTermos = -1; //inicializando as vari�veis com valores indicadores de erro f�ceis de rastrear
		double mediana = -1.0; //inicializando as vari�veis com valores indicadores de erro f�ceis de rastrear
		Scanner leitor = new Scanner(System.in);
		String resposta;
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("Testando a Quest�o 1");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		do {
			System.out.println("*************************************************************************************************************");
			System.out.println("Para o teste da Quest�o 1, entre com o n�mero de termos da sequ�ncia de Fibonacci para o c�lculo da mediana");
			System.out.println("Para finalizar, entre com um n�mero de termos menor ou igual a zero");
			System.out.print("N�mero de termos da sequ�ncia: ");
			//leitor 
			resposta = leitor.next();
			numeroTermos = Integer.parseInt(resposta);
			mediana = questao1(numeroTermos);
			if(mediana>=0) System.out.println("A mediana da sequ�ncia com "+numeroTermos+" termos � "+ mediana);
		}while(numeroTermos>0);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("Teste da Quest�o 1 finalizado. Testando a Quest�o 3:");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		int idade = -1; //inicializando as vari�veis com valores indicadores de erro f�ceis de rastrear		
		do {
			System.out.println("*************************************************************************************************************");
			System.out.println("Para o teste da Quest�o 3, entre com a idade do paciente");
			System.out.println("Para finalizar, entre com uma idade menor ou igual a zero");
			System.out.print("Idade do indiv�duo: ");
			resposta = leitor.next();
			idade = Integer.parseInt(resposta);
			System.out.print("O indiv�duo apresenta comorbidade (S/N)? ");
			leitor = new Scanner(System.in);
			resposta = leitor.next();
			boolean elegivel = false; //determinando se o indiv�duo � ou n�o eleg�vel para vacina��o
			if(("S".equals(resposta))||("s".equals(resposta))) elegivel = vacinado(idade,true); else elegivel = vacinado(idade, false);	
			if(elegivel) {
				if(("S".equals(resposta))||("s".equals(resposta)))
					System.out.println("\nO indiv�duo de idade "+idade+" apresenta comorbidade e � eleg�vel para vacina��o\n");
				else
					System.out.println("\nO indiv�duo de idade "+idade+" N�O apresenta comorbidade � eleg�vel para vacina��o\n");
			} else {
				if(("S".equals(resposta))||("s".equals(resposta)))
					System.out.println("\nO indiv�duo de idade "+idade+" apresenta comorbidade e � N�O eleg�vel para vacina��o\n");
				else
					System.out.println("\nO indiv�duo de idade "+idade+" N�O apresenta comorbidade e N�O � eleg�vel para vacina��o\n");
			}
		}while(idade>0);
		leitor.close();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("Teste da Quest�o 3 finalizado. Fechando o programa");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

}
