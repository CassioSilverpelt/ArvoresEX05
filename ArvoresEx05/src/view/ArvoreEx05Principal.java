package view;
import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class ArvoreEx05Principal {

public static void main (String[] args) {
		
		int[] vetor = {30, 15, 10, 20, 60, 40, 80};
		int tamanhovet = vetor.length;
		
		ArvoreInt arvoreint = new ArvoreInt();
		
		for (int i = 0; i < tamanhovet; i ++) {
			arvoreint.insert(vetor[i]);
		}
		
		arvoreint.remove(60);
		
		try {
			arvoreint.prefixSearch();
			System.out.println();
			arvoreint.infixSearch();
			System.out.println();
			arvoreint.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
