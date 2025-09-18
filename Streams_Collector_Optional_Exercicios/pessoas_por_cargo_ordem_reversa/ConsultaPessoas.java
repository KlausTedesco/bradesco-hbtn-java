/*import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
		return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
					() -> new TreeMap<>(Comparator.reverseOrder()),
					Collectors.toCollection(TreeSet::new)
		       ));
	}
	
	public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas){
		return pessoas.stream().collect(Collectors.groupingBy(
					Pessoa::getCargo, Collectors.mapping(
						Pessoa::getIdade, Collectors.toList())));				
	}
	
	public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoas){
		return pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo,
						Collectors.filtering(p -> p.getIdade()>40, Collectors.toList())));				
	}
}
*/