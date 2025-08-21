/*import java.util.List;

public class ManipularArrayNumeros {
	
	//Esse método deve retornar a posicao do número na lista, se número não for encontrado retorna -1.
	private static Integer buscarPosicaoNumero(List<Integer> numeros, Integer numeroBuscado) {
	    if (numeros.contains(numeroBuscado)) {
	        return numeros.indexOf(numeroBuscado);
	    } else {
	        return -1; 
	    }	
	}

	//Método verifica se o número já existe na lista, se sim, lança uma exceção com a mensagem Numero jah contido na lista, 
	//se não, adiciona o item na lista.
	public static void adicionarNumero(List<Integer> numeros, Integer numeroAdd) {
	    if (-1 != buscarPosicaoNumero(numeros, numeroAdd)) {
	        throw new IllegalArgumentException("Numero jah contido na lista");
	    }
	    numeros.add(numeroAdd);
	}
	
	//Metodo verifica se o número não for encontrado na lista e lança exceção com a mensagem Numero nao encontrado na lista.
	//se não, remove da lista.
	public static void removerNumero(List<Integer> numeros, Integer numeroRemover) {
	    Integer indice = buscarPosicaoNumero(numeros, numeroRemover);
		if (-1 == indice) {
	        throw new IllegalArgumentException("Numero nao encontrado na lista");
	    }
	    numeros.remove(numeros.get(indice));
	}
	
	//Metodo busca o numero e substituí. Caso o número a ser substituído não exista, apenas adicione o número substituto.
	public static void substituirNumero(List<Integer> numeros, Integer numeroSubstituir, Integer numeroSubstituto) {
	    Integer indice = buscarPosicaoNumero(numeros, numeroSubstituir);
		if (-1 == indice) { //"Numero nao encontrado na lista"
			numeros.add(numeroSubstituto);
	    } else {
	    	numeros.set(indice, numeroSubstituto);
	    }
	}
}
*/