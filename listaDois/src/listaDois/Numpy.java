package listaDois;

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

}
