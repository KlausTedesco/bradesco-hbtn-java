/*public class PessoasArray {

	private String[] nomes;

	public PessoasArray() {
		nomes = new String[] { "Amanda", "Beatriz", "Carlos", "Daniela", "Eduardo", "Fabio", "Gustavo", "Hingrid",
				"Isabela", "Joao", "Leise", "Maria", "Norberto", "Otavio", "Paulo", "Quirino", "Renata", "Sabata",
				"Tais", "Umberto", "Vanessa", "Xavier" };
	}

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}

	public void buscaBinaria(String nome) {
		System.out.println("Procurando o nome: \"" + nome + "\"");
		boolean encontrado = false;
		int fim = this.nomes.length - 1;
		int inicio = 0;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			System.out.println("Passando pelo indice: " + meio);
			int comparacao = nome.compareTo(this.nomes[meio]);
			
			if (comparacao == 0) {
				System.out.println("Nome " + nome + " encontrado na posição " + meio);
				encontrado = true;
				return;
			} else if (comparacao < 0) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}

		if (encontrado == false) {
			throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
		}
	}
}
*/