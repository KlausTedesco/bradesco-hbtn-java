/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
	
	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<Estudante>();
		estudantes.add(new Estudante("klaus", 33));
		estudantes.add(new Estudante("claudia", 40));
		estudantes.add(new Estudante("demetrio", 12));
		estudantes.add(new Estudante("frederico", 7));
		estudantes.add(new Estudante("mari", 47));
		
		//Códigos que imprimem 
		// a quantidade de estudantes com idade abaixo de 18 
		// e a quantidade de estudantes de 18 anos ou mais
		
		
		// Forma 1 usando "groupingBy" para agrupamento 
		// add novo mapping (Map) e depois percorrendo(forEach) novo Map para imprimir  
		estudantes.stream().collect(Collectors.groupingBy(
			    a -> a.getIdade() >= 18, 
			        Collectors.mapping(
			            Estudante::getNome, 
			            Collectors.counting())))
			.forEach((c, d) -> System.out.println(d));

		
		// Forma 2 usando "partitioningBy" (retorna Map) para dividir em duas partes 
		// add chave (idade maior que 18, quantidade) e "forEach" para mostrar quantidade
		estudantes.stream().collect(Collectors.partitioningBy(
			    a -> a.getIdade() >= 18, Collectors.counting()))
			.forEach((c, d) -> System.out.println(d));

		
		// Forma SEM utilização de Collectors
		// mas realizando mesma logica dos demais
		List<Integer> lista = Arrays.asList(0, 0);
		estudantes.forEach(w -> {
		    if (w.getIdade() >= 18) {
		    	lista.set(1, lista.get(1) + 1);
		    } else {
		    	lista.set(0, lista.get(0) + 1);
		    }
		});
		lista.forEach(System.out::println); 
	}
	

}
class Estudante {
    private String nome;
    private Integer idade;

    Estudante(String nome, Integer idade) {
        this.nome = nome; 
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }
}*/