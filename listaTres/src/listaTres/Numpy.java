package listaTres;

public class Numpy {
	//======Retorna o �ltimo elemento do array sem apag�-lo======
			public int pop(int[] elementos) {
				return(elementos[elementos.length-1]); //length � o tamanho do array que � indexado de 0 � n-1
			}
			//======Vasculha o array encontrando o maior elemento======
			public int max(int[] elementos) {
				int maior = elementos[0];
				for(int i=1;i<elementos.length;i++) {
					if(elementos[i]>maior) maior = elementos[i];
				}
				return(maior);
			}
			//======Soma todos os elementos do array======
			public int sum(int[] elementos) {
				int soma = 0;
				for(int i=0;i<elementos.length;i++) {
					soma = soma + elementos[i];
				}
				return(soma);
			}
			//======Calcula a m�dia aritm�tica de todos os elementos do array======
			public int mean(int[] elementos) {
				return(sum(elementos)/elementos.length); //Acredito que o valor de retorno deveria ser double pois a m�dia de um conjunto de n�meros inteiros pode n�o ser um n�mero inteiro
			}
		    //======Filtra dentre todos os elementos do array aqueles n�meros que s�o primos======
			public int[] getPrime(int[] elementos) {
		            int[] temporario = new int[elementos.length]; //Criando um vetor tempor�rio com a mesma quantidade de elementos do array original
		            int qtdePrimos = 0; //conta quantos primos h� no array
		            int numero; //n�mero a testar se � primo
		            boolean isPrime;
		            for(int i=0;i<elementos.length;i++){
		                numero = elementos[i];
		                isPrime = true; // Sup�e por hip�tese que o n�mero � primo
		                if(numero==0||numero==1) {
	                    	isPrime = false;
		                }
		                for(int j=2;j<=numero-1;j++){
		                	if(numero%j==0){
		                        isPrime = false; //se o n�mero � divis�vel por j ele n�o � primo
		                        break; //sa� do for interno
		                    }
		                }
		                if(isPrime){
		                    temporario[qtdePrimos]=numero; //guarda o primo no vetor tempor�rio e incrementa a quantidade de primos encontrada
		                    qtdePrimos++;
		                }
		            }
		            //Criando um vetor com a quantidade correta de primos para devolver
		            int[] primos = new int[qtdePrimos];
		            for(int i=0;i<qtdePrimos;i++) {
		                primos[i]=temporario[i];
		            }
		            return primos;
		        }
		    public float generateMean(int[] elementos, int window, int index){
		        int soma = 0;
		        for(int i=index;i<index+window;i++) soma = soma + elementos[i];
		        return((float) soma/(float) window);
		    }
		}


