import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Blog {

	private List<Post> postagens;
	
	public Blog() {
		this.postagens = new ArrayList<Post>();
	}

	public void adicionarPostagem(Post novaPostagem) {
		this.postagens.add(novaPostagem);
	}
	
	public Set<String> obterTodosAutores(){
		List<Post> listaPostagens = this.postagens;
	    LinkedHashSet<String> autoresOrdenadosENaoDuplicados = listaPostagens.stream()
	            .sorted((p1, p2) -> p1.getAutor().compareTo(p2.getAutor()))
	            .map(Post::getAutor)
	            .collect(Collectors.toCollection(LinkedHashSet::new)); 
		
	    return autoresOrdenadosENaoDuplicados;
	}
	
	public Map<String, Integer> obterContagemPorCategoria() {
		List<Post> listaPostagens = this.postagens;
/*		Map<String, Integer> quantidadePostagensPorCategoria = listaPostagens.stream()
	            .sorted((p1, p2) -> p1.getCategoria().compareTo(p2.getCategoria())) // não funcionou para ordenar
				.collect(Collectors.groupingBy(Post::getCategoria, Collectors.collectingAndThen(
		                Collectors.counting(), Long::intValue)));*/
		Map<String, Long> quantidadePostagensPorCategoria = listaPostagens.stream()
			    .collect(Collectors.groupingBy(Post::getCategoria, Collectors.counting()));

		Map<String, Integer> mapOrdenado = quantidadePostagensPorCategoria.entrySet().stream()
		    .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())) // Ordena pelas chaves (nomes das categorias)
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        entry -> entry.getValue().intValue(), // Converte Long para Integer
		        (oldValue, newValue) -> oldValue,    // Em caso de duplicação, mantém o valor antigo
		        LinkedHashMap::new                   // Garante que o map seja ordenado
		    ));
	
		return mapOrdenado;	
	}
	
}