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

	public void adicionarPostagem(Post post) {
		for (Post postOfList : postagens) {
			if (postOfList.getAutor().equals(post.getAutor()) && postOfList.getTitulo().equals(post.getTitulo())) {
				throw new IllegalArgumentException("Postagem jah existente");
			}
		}
		this.postagens.add(post);
	}

	public Set<Autor> obterTodosAutores() {
		List<Post> listaPostagens = this.postagens;
		LinkedHashSet<Autor> autoresOrdenadosENaoDuplicados = listaPostagens.stream()
				.sorted((p1, p2) -> p1.getAutor().compareTo(p2.getAutor())).map(Post::getAutor)
				.collect(Collectors.toCollection(LinkedHashSet::new));

		return autoresOrdenadosENaoDuplicados;
	}

	public Map<Categorias, Integer> obterContagemPorCategoria() {
		// Traz a categoria que tem mais post antes
		List<Post> listaPostagens = this.postagens;
		Map<Categorias, Long> quantidadePostagensPorCategoria = listaPostagens.stream()
				.collect(Collectors.groupingBy(Post::getCategoria, Collectors.counting()));

		Map<Categorias, Integer> mapOrdenado = quantidadePostagensPorCategoria.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Ordena pela contagem em ordem
																				// decrescente
				// .sorted(Map.Entry.comparingByValue()) // Colocar em ordem crescente
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().intValue(),
						(e1, e2) -> e1, // Em caso de chaves duplicadas, mantenha o primeiro
						LinkedHashMap::new)); // Use LinkedHashMap para manter a ordem

		return mapOrdenado;
	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		List<Post> postsFiltrados = postagens.stream() // Inicia um stream da lista de todos os posts
				.filter(post -> 0 == post.getAutor().compareTo(autor)) // Filtra apenas os posts do autor especificado
				// .sorted((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()))// Ordena os
				// posts pelo título
				.sorted(Comparator.comparing(Post::getTitulo)) // Outra forma de ordena-lo
				.collect(Collectors.toList()); // Coleta os posts ordenados para um List, devido Set não garantir
												// ordenação
		return new LinkedHashSet<>(postsFiltrados);

	}

	public Set<Post> obterPostsPorCategoria(Categorias categoria) {
		// 1. Filtrar os posts pela categoria desejada
		List<Post> postsFiltrados = postagens.stream().filter(post -> post.getCategoria() == categoria)
				.collect(Collectors.toList());

		// 2. Ordenar os posts filtrados pelo título
		postsFiltrados.sort(Comparator.comparing(Post::getTitulo));

		// 3. Retornar como um LinkedHashSet para preservar a ordem de inserção (e
		// consequentemente a ordem do título)
		// Se a ordem não for importante, poderia usar um HashSet, mas isso não
		// atenderia ao requisito de "ordenados pelo título".
		return new LinkedHashSet<>(postsFiltrados);
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		// Ordenar as Categorias decrescente (+ posts)
		// Ordenar alfabetica dentro dos Post
		Map<Categorias, Set<Post>> mapa = new LinkedHashMap<Categorias, Set<Post>>();
		Map<Categorias, Integer> categoriasOrdenadas = obterContagemPorCategoria();

		categoriasOrdenadas.forEach((categoria, numeroPosts) -> {
			List<Post> postsFiltrados = postagens.stream()
					.filter(post -> post.getCategoria() == categoria)
					.sorted(Comparator.comparing(Post::getTitulo))
					.collect(Collectors.toList());

			mapa.put(categoria, new LinkedHashSet<>(postsFiltrados));
		});

		return mapa;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {

		Map<Autor, Set<Post>> mapa = new LinkedHashMap<Autor, Set<Post>>();
		LinkedHashSet<Autor> autoresOrdenados = (LinkedHashSet<Autor>) obterTodosAutores();

		autoresOrdenados.forEach((autor) -> {
			List<Post> postsFiltrados = postagens.stream()
					.filter(post -> post.getAutor() == autor)
					.sorted(Comparator.comparing(Post::getTitulo))
					.collect(Collectors.toList());

			mapa.put(autor, new LinkedHashSet<>(postsFiltrados));
		});

		return mapa;
	}

}