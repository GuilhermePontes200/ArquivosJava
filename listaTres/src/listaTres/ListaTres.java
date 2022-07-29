package listaTres;

import java.util.Scanner;
public class ListaTres {
	/*public static int countSubstringsChar (String parameter, char test) {
		if(!parameter.matches("[a-zA-Z]*")) {
			System.out.println("String possui carácter inválido");
			return -1; 
		}
		String testS=String.valueOf(test);
		int[] armazemposicaochar= new int[100];
		int armazemposicaostrg=0;
		int armazemquantidadchar=0;
		for(int i=0;i<parameter.length();i++) {
			if(parameter.substring(i,i+1).equals(testS)) { 
				armazemposicaostrg=i+1;
				break;
			}
			else armazemposicaochar[0]++;
		}
		if(armazemposicaochar[0]==parameter.length()) {
			System.out.println("String não possui carácter buscado");
			return 0;
		}else {
			for(int n=armazemposicaostrg;n<parameter.length();n++) {
				if(parameter.substring(n,n+1).equals(testS)) {
					System.out.println(parameter.substring(armazemposicaochar[armazemquantidadchar],n));
					armazemquantidadchar++;
					armazemposicaochar[armazemquantidadchar]=n;
				}
			}System.out.println(parameter.substring(armazemposicaochar[armazemquantidadchar]));
			return armazemquantidadchar+1;
		}
	}*/
		public static int countSubstringsLetter (String parameter, char test) {
			if(parameter.length()>100)
			{
				System.out.println("String é muito grande, tente novamente");
				return -1;
			}
			if(!parameter.matches("[a-zA-Z]*")) {
				System.out.println("String possui carácter inválido, tente novamente");
				return -1; 
			}
			String testS=String.valueOf(test); 
			if(!testS.matches("[a-zA-Z]*")) {
				System.out.println("Carácter de comparação não é uma letra, tente novamente");
				return -1; 
			}
			//ambos os ifs testam tanto a string quanto o caractere à procura de situações inválidas aos propositos da questão e encerram 
			//o programa prematuramente caso as encontre (Além de já converter o caracter de teste original para o formato "string" para uso 
			//futuro).
			char test2='0';
			String testS2="0";			
			if(Character.isLowerCase(test)) {
				test2=Character.toUpperCase(test);
			}else if (Character.isUpperCase(test)) {
				test2=Character.toLowerCase(test);
			}			
			testS2=String.valueOf(test2);//verifica se o caracter de teste é maiúsculo ou minúsculo, cria um segundo caracter de teste 
			//com o tamanho oposto ao original e o transforma em uma string de forma a poder ser utilizados pela função de comparação equals 
			// junto à variavel original, previamente convertida. 
			int[] armazemposicaochar= new int[100];
			int armazemposicaostrg=0;
			int armazemquantidadchar=0;//variáveis contadoras que armazenam posições na string a serem usadas na criação de substrings e
			//medem a quantidade de substrings criadas
			for(int i=0;i<parameter.length();i++) {
				if(parameter.substring(i,i+1).equals(testS)||parameter.substring(i,i+1).equals(testS2)) { 
					armazemposicaostrg=i+1;
					break;
				}
				else armazemposicaochar[0]++;
			}
			if(armazemposicaochar[0]==parameter.length()) {
				System.out.println("String não possui carácter buscado, tente novamente");
				return 0;//vasculha a string de forma a verificar se a mesma possui alguma substring começando com o carácter de teste 
				//e, em caso negativo, exibe uma mensagem de erro.
				//em caso positivo, armazena tanto a primeira posição onde tal carácter foi encontrado quanto a posição subsequente
			}else {
				for(int n=armazemposicaostrg;n<parameter.length();n++) {
					if(parameter.substring(n,n+1).equals(testS)||parameter.substring(n,n+1).equals(testS2)) {
						System.out.println(parameter.substring(armazemposicaochar[armazemquantidadchar],n));
						armazemquantidadchar++;
						armazemposicaochar[armazemquantidadchar]=n;
					}
				}System.out.println(parameter.substring(armazemposicaochar[armazemquantidadchar]));
				return armazemquantidadchar+1;//determina as posições de inicio e termino das substrings, as imprime na tela e devolve 
				//o número das mesmas encontrado.
			}
}
		public static void questao1() {
			char T='0';
			String ST = "0";
			String teste="0";
			String resposta;
			int quantsubstrings;		
			Scanner scanQ1= new Scanner(System.in);		
			do {	
				System.out.println("=========Questão 1/Lista 3=========\\n");
				System.out.println("digite 1 para iniciar ou continuar o programas de criação de substrings");
				System.out.println("digite qualquer outra coisa para progredir para a próxima questão");
				resposta=scanQ1.nextLine();
				switch(resposta){
				case "1":
					System.out.println("digite uma string que contenha somente letras e, no máximo, 100 caracteres");
					teste=scanQ1.nextLine();
					System.out.println("digite uma letra para propositos de comparação e criação de substrings");
					System.out.println("você pode digitar uma string nessa seção, porém só o primeiro caracter será considerado");
					ST=scanQ1.nextLine();
					T=ST.charAt(0);
					quantsubstrings=countSubstringsLetter(teste,T);		
					System.out.println("o programa tem "+quantsubstrings+" substrings iniciadas com a letra "+T);
					break;
				default:
					return;
				}
			}while(true);
		}
		public static void questao2() {
	        Scanner scanQ2= new Scanner(System.in);
	        Numpy np = new Numpy(); //Instância a classe Numpy
	        int N = 5; //A questão pede que o array tenha 5 elementos. Criei um inteiro para que as mudanças, se houverem, nessa condição possam ser centralizadas todas aqui.
	        int[] elementos = new int[N]; //Instância um vetor/array de inteiros com N elementos
	        int X; //um elemento particular da array
	        do{
	            System.out.println("Escolha uma das opções abaixo:\n");
	            System.out.println("\t1.Inserir um novo vetor");
	            System.out.println("\t2.Visualizar o último valor, sem remover da lista. (pop)");
	            System.out.println("\t3.Visualizar o maior valor. (max)");
	            System.out.println("\t4.Visualizar a soma dos valores. (sum)");
	            System.out.println("\t5.Visualizar a média dos valores. (mean)");
	            System.out.println("\t6.Visualizar os números primos no vetor (getPrime)");
	            System.out.println("\t7.Calcular a média móvel");
	            System.out.println("\t8.Sair (Digitar qualquer resposta diferente de 1 à 7 também finaliza a questão)");
	            String resposta=scanQ2.nextLine();
	            switch(resposta){
	                case "1":
	                    System.out.println("\t\t---Entre com os elementos do array (um por vez)---");
	                    int i=0;
	                    while(i<N) { //Aqui iremos simular um laço for. O incremento de i será feito apenas no caso de um valor adequado fornecido ao array
	                        System.out.println("\t\t\t> Entre com o elemento "+(i+1)+" de "+N+" do array:");
	                        resposta=scanQ2.nextLine(); //lendo a resposta como uma string
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

	                    //imprimindo o vetor
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
	                case "6":
	                    int[] primos = np.getPrime(elementos);
	                    if(primos.length==0){
	                        System.out.println("\t\t>>> Não há primos no array ");
	                    } else {
	                        System.out.print("\t\t>>> Os elementos primos do array são [ ");
	                        for(int j=0;j<primos.length-1;j++) System.out.print(primos[j]+" , ");
	                        System.out.println(primos[primos.length-1]+" ]");
	                    }
	                    break;
	                case "7":
	                    int window, index;
	                    
	                    do{
	                        System.out.println("\t\t\t----> Entre com o índice inicial da média móvel do array");
	                        resposta=scanQ2.nextLine(); //lendo a resposta como uma string
	                        try{
	                            index = Integer.parseInt(resposta);
	                        }
	                        catch (NumberFormatException ex){ //Se o usuário não digitou um índice válido, pede novamente os dados
	                            System.out.println("\t\t\t----> > Resposta inválida. Entre novamente com o valor");
	                            continue; // passa para a próxima iteração sem incrementar i
	                        }
	                        if((index<0)||(index>=elementos.length)){
	                            System.out.println("\t\t\t----> > Índice "+index+" fora dos limites. Entre novamente com o valor");
	                        }
	                        else break; //Se tudo certo, saí do laço
	                    }while(true);
	                    
	                    
	                    do{
	                        System.out.println("\t\t\t----> Entre com a janela para o cálculo da média móvel do array");
	                        resposta=scanQ2.nextLine(); //lendo a resposta como uma string
	                        try{
	                            window = Integer.parseInt(resposta);
	                        }
	                        catch (NumberFormatException ex){ //Se o usuário não digitou um índice válido, pede novamente os dados
	                            System.out.println("\t\t\t----> > Resposta inválida. Entre novamente com o valor");
	                            continue; // passa para a próxima iteração sem incrementar i
	                        }
	                        if((index+window>elementos.length)){
	                            System.out.println("\t\t\t----> > Janela "+window+" fora dos limites. Entre novamente com o valor");
	                        }
	                        else 
	                            break; //Se tudo certo, saí do laço
	                    }while(true);
	                    
	                    float wmean = np.generateMean(elementos, window, index);
	                    System.out.printf("\t\t>>> a média móvel do array para janela %d a partir do índice %d é %.2f\n",window,index,wmean);
	                    break;
	                default:
	                    return;
	            }
	        }while(true);
	        }
	public static void main(String[] args) {
		questao1();
		System.out.println("=========Questão 2/Lista 3=========\n");
        questao2();
        System.out.println("===================================\n");
}
}