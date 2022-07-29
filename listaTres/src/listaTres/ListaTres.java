package listaTres;

import java.util.Scanner;
public class ListaTres {
	/*public static int countSubstringsChar (String parameter, char test) {
		if(!parameter.matches("[a-zA-Z]*")) {
			System.out.println("String possui car�cter inv�lido");
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
			System.out.println("String n�o possui car�cter buscado");
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
				System.out.println("String � muito grande, tente novamente");
				return -1;
			}
			if(!parameter.matches("[a-zA-Z]*")) {
				System.out.println("String possui car�cter inv�lido, tente novamente");
				return -1; 
			}
			String testS=String.valueOf(test); 
			if(!testS.matches("[a-zA-Z]*")) {
				System.out.println("Car�cter de compara��o n�o � uma letra, tente novamente");
				return -1; 
			}
			//ambos os ifs testam tanto a string quanto o caractere � procura de situa��es inv�lidas aos propositos da quest�o e encerram 
			//o programa prematuramente caso as encontre (Al�m de j� converter o caracter de teste original para o formato "string" para uso 
			//futuro).
			char test2='0';
			String testS2="0";			
			if(Character.isLowerCase(test)) {
				test2=Character.toUpperCase(test);
			}else if (Character.isUpperCase(test)) {
				test2=Character.toLowerCase(test);
			}			
			testS2=String.valueOf(test2);//verifica se o caracter de teste � mai�sculo ou min�sculo, cria um segundo caracter de teste 
			//com o tamanho oposto ao original e o transforma em uma string de forma a poder ser utilizados pela fun��o de compara��o equals 
			// junto � variavel original, previamente convertida. 
			int[] armazemposicaochar= new int[100];
			int armazemposicaostrg=0;
			int armazemquantidadchar=0;//vari�veis contadoras que armazenam posi��es na string a serem usadas na cria��o de substrings e
			//medem a quantidade de substrings criadas
			for(int i=0;i<parameter.length();i++) {
				if(parameter.substring(i,i+1).equals(testS)||parameter.substring(i,i+1).equals(testS2)) { 
					armazemposicaostrg=i+1;
					break;
				}
				else armazemposicaochar[0]++;
			}
			if(armazemposicaochar[0]==parameter.length()) {
				System.out.println("String n�o possui car�cter buscado, tente novamente");
				return 0;//vasculha a string de forma a verificar se a mesma possui alguma substring come�ando com o car�cter de teste 
				//e, em caso negativo, exibe uma mensagem de erro.
				//em caso positivo, armazena tanto a primeira posi��o onde tal car�cter foi encontrado quanto a posi��o subsequente
			}else {
				for(int n=armazemposicaostrg;n<parameter.length();n++) {
					if(parameter.substring(n,n+1).equals(testS)||parameter.substring(n,n+1).equals(testS2)) {
						System.out.println(parameter.substring(armazemposicaochar[armazemquantidadchar],n));
						armazemquantidadchar++;
						armazemposicaochar[armazemquantidadchar]=n;
					}
				}System.out.println(parameter.substring(armazemposicaochar[armazemquantidadchar]));
				return armazemquantidadchar+1;//determina as posi��es de inicio e termino das substrings, as imprime na tela e devolve 
				//o n�mero das mesmas encontrado.
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
				System.out.println("=========Quest�o 1/Lista 3=========\\n");
				System.out.println("digite 1 para iniciar ou continuar o programas de cria��o de substrings");
				System.out.println("digite qualquer outra coisa para progredir para a pr�xima quest�o");
				resposta=scanQ1.nextLine();
				switch(resposta){
				case "1":
					System.out.println("digite uma string que contenha somente letras e, no m�ximo, 100 caracteres");
					teste=scanQ1.nextLine();
					System.out.println("digite uma letra para propositos de compara��o e cria��o de substrings");
					System.out.println("voc� pode digitar uma string nessa se��o, por�m s� o primeiro caracter ser� considerado");
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
	        Numpy np = new Numpy(); //Inst�ncia a classe Numpy
	        int N = 5; //A quest�o pede que o array tenha 5 elementos. Criei um inteiro para que as mudan�as, se houverem, nessa condi��o possam ser centralizadas todas aqui.
	        int[] elementos = new int[N]; //Inst�ncia um vetor/array de inteiros com N elementos
	        int X; //um elemento particular da array
	        do{
	            System.out.println("Escolha uma das op��es abaixo:\n");
	            System.out.println("\t1.Inserir um novo vetor");
	            System.out.println("\t2.Visualizar o �ltimo valor, sem remover da lista. (pop)");
	            System.out.println("\t3.Visualizar o maior valor. (max)");
	            System.out.println("\t4.Visualizar a soma dos valores. (sum)");
	            System.out.println("\t5.Visualizar a m�dia dos valores. (mean)");
	            System.out.println("\t6.Visualizar os n�meros primos no vetor (getPrime)");
	            System.out.println("\t7.Calcular a m�dia m�vel");
	            System.out.println("\t8.Sair (Digitar qualquer resposta diferente de 1 � 7 tamb�m finaliza a quest�o)");
	            String resposta=scanQ2.nextLine();
	            switch(resposta){
	                case "1":
	                    System.out.println("\t\t---Entre com os elementos do array (um por vez)---");
	                    int i=0;
	                    while(i<N) { //Aqui iremos simular um la�o for. O incremento de i ser� feito apenas no caso de um valor adequado fornecido ao array
	                        System.out.println("\t\t\t> Entre com o elemento "+(i+1)+" de "+N+" do array:");
	                        resposta=scanQ2.nextLine(); //lendo a resposta como uma string
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

	                    //imprimindo o vetor
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
	                case "6":
	                    int[] primos = np.getPrime(elementos);
	                    if(primos.length==0){
	                        System.out.println("\t\t>>> N�o h� primos no array ");
	                    } else {
	                        System.out.print("\t\t>>> Os elementos primos do array s�o [ ");
	                        for(int j=0;j<primos.length-1;j++) System.out.print(primos[j]+" , ");
	                        System.out.println(primos[primos.length-1]+" ]");
	                    }
	                    break;
	                case "7":
	                    int window, index;
	                    
	                    do{
	                        System.out.println("\t\t\t----> Entre com o �ndice inicial da m�dia m�vel do array");
	                        resposta=scanQ2.nextLine(); //lendo a resposta como uma string
	                        try{
	                            index = Integer.parseInt(resposta);
	                        }
	                        catch (NumberFormatException ex){ //Se o usu�rio n�o digitou um �ndice v�lido, pede novamente os dados
	                            System.out.println("\t\t\t----> > Resposta inv�lida. Entre novamente com o valor");
	                            continue; // passa para a pr�xima itera��o sem incrementar i
	                        }
	                        if((index<0)||(index>=elementos.length)){
	                            System.out.println("\t\t\t----> > �ndice "+index+" fora dos limites. Entre novamente com o valor");
	                        }
	                        else break; //Se tudo certo, sa� do la�o
	                    }while(true);
	                    
	                    
	                    do{
	                        System.out.println("\t\t\t----> Entre com a janela para o c�lculo da m�dia m�vel do array");
	                        resposta=scanQ2.nextLine(); //lendo a resposta como uma string
	                        try{
	                            window = Integer.parseInt(resposta);
	                        }
	                        catch (NumberFormatException ex){ //Se o usu�rio n�o digitou um �ndice v�lido, pede novamente os dados
	                            System.out.println("\t\t\t----> > Resposta inv�lida. Entre novamente com o valor");
	                            continue; // passa para a pr�xima itera��o sem incrementar i
	                        }
	                        if((index+window>elementos.length)){
	                            System.out.println("\t\t\t----> > Janela "+window+" fora dos limites. Entre novamente com o valor");
	                        }
	                        else 
	                            break; //Se tudo certo, sa� do la�o
	                    }while(true);
	                    
	                    float wmean = np.generateMean(elementos, window, index);
	                    System.out.printf("\t\t>>> a m�dia m�vel do array para janela %d a partir do �ndice %d � %.2f\n",window,index,wmean);
	                    break;
	                default:
	                    return;
	            }
	        }while(true);
	        }
	public static void main(String[] args) {
		questao1();
		System.out.println("=========Quest�o 2/Lista 3=========\n");
        questao2();
        System.out.println("===================================\n");
}
}