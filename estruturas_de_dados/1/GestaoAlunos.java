import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestaoAlunos {

	private List<Aluno> alunos = new ArrayList<>();
   
    //Adicionar um aluno à lista.
	public void adicionarAluno(String nome, int idade) {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(idade);
		this.alunos.add(aluno);
		System.out.println(aluno.toString()+" adicionado!");
	}
    //Excluir um aluno pelo nome.
	public void excluirAluno(String nome) {
		Aluno aluno = getAluno(nome);
		if(aluno != null) {
			this.alunos.remove(aluno);
			System.out.println("Aluno excluido com sucesso!");			
		} else {
			System.err.println("Aluno "+nome+" não excluido!");			
		}
	}
	
    //Buscar um aluno pelo nome e exibir suas informações (nome e idade).
	public void buscarAluno(String nome) {
		Optional<Aluno> alunoOp = this.alunos.stream()
				.filter(n -> n.getNome().equalsIgnoreCase(nome))
				.findFirst();
		if(!alunoOp.isPresent()) {
			System.err.println("Aluno não encontrado!");			
		} 
		System.out.println("Resultado da busca:");
		System.out.println(alunoOp.get().toString());
	}
	
	//Exibir todos os alunos cadastrados.
	public void listarAlunos() {
		System.out.println("Listando alunos:");
		this.alunos.forEach(aluno -> System.out.println(aluno.toString()));
		System.out.println("----------------");
	}

	
	private Aluno getAluno(String nome) {
		Aluno aluno = null;
		try{
			Optional<Aluno> alunoOp =  this.alunos.stream()
					.filter(n -> n.getNome().equalsIgnoreCase(nome))
					.findFirst();
			if(alunoOp.isPresent()) {
				aluno = alunoOp.get();
			}
		}catch (Exception e) {
			System.err.println("Aluno não encontrado!");			
		}
		return aluno;
	}
	
/*    private String gerarNomeAluno() {
        List<String> nomes = Arrays.asList("Ana", "João", "Carlos", "Maria", "José");
        List<String> sobrenomes = Arrays.asList("Silva", "Oliveira", "Pereira", "Nunes", "Souza");

        Random random = new Random();
        int indiceAleatorio = random.nextInt(nomes.size());
        String nomeAleatorio = nomes.get(indiceAleatorio);
        String sobrenomeAleatorio = sobrenomes.get(indiceAleatorio);
        
    	return nomeAleatorio+" "+sobrenomeAleatorio;
    }
    
    private int gerarIdadeAluno() {
    	Random random = new Random();
        int idadeMinima = 18;
        int idadeMaxima = 30;
        
        return random.nextInt(idadeMaxima - idadeMinima + 1) + idadeMinima;    
     } */
}