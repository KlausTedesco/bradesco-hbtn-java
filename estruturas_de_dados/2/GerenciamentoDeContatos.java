import java.util.HashMap;
import java.util.Map;


public class GerenciamentoDeContatos {
    private Map<String, Contato> contatos;


    // Construtor
    public GerenciamentoDeContatos() {
        contatos = new HashMap<>();
    }


    // Adiciona um novo contato
    public void adicionarContato(String nome, String telefone, String email) {
		if(this.contatos.containsKey(nome)) {
			System.out.println("Erro: Contato com nome "+ nome +" já existe!");
			return;
		}
		if(this.contatos.values().stream().anyMatch(
				contatos -> contatos.getEmails().contains(email))) {
			System.out.println("Erro: Email "+ email +" já existe para outro contato!");
			return;
		}
		
    	Contato contato = new Contato();
    	contato.adicionarTelefone(telefone);
    	contato.adicionarEmail(email);
    	contatos.put(nome, contato);
    	System.out.println("Contato "+ nome +" adicionado com sucesso!");
    }

    
	// Exibe todos os contatos
    public void exibirContatos() {
    	this.contatos.forEach((nome, contato) -> {
    		System.out.println("Nome: "+ nome);
    		contato.exibirContato();
    		System.out.println("-------------------------------");
    	});
    }


    // Busca um contato pelo nome
    public void buscarContato(String nome) {
        if(!this.contatos.containsKey(nome)) {
        	System.out.println("Contato "+ nome +" não encontrado.");        	
        	return;
        }
        
        System.out.println("Contato encontrado: "+ nome);
    	this.contatos.get(nome).exibirContato();
    }


    // Remove um contato pelo nome
    public void removerContato(String nome) {
        if(!this.contatos.containsKey(nome)) {
        	System.out.println("Contato "+ nome +" não encontrado.");
        	return;
        }
        
    	this.contatos.remove(nome);
    	System.out.println("Contato "+ nome +" removido com sucesso!");
    }


    public static void main(String[] args) {
        GerenciamentoDeContatos gestao = new GerenciamentoDeContatos();


        // Adicionando contatos
        gestao.adicionarContato("Carlos", "1234-5678", "carlos@email.com");
        gestao.adicionarContato("Maria", "8765-4321", "maria@email.com");
        gestao.adicionarContato("Ana", "1122-3344", "ana@email.com");
        gestao.adicionarContato("Carlos", "1234-5678", "carlos@email.com"); // Tentando duplicar


        // Exibindo todos os contatos
        System.out.println("\nExibindo todos os contatos:");
        gestao.exibirContatos();


        // Buscando um contato
        System.out.println("\nBuscando contato 'Maria':");
        gestao.buscarContato("Maria");


        // Removendo um contato
        System.out.println("\nRemovendo contato 'Carlos':");
        gestao.removerContato("Carlos");


        // Tentando remover um contato inexistente
        System.out.println("\nTentando remover contato 'João' que não existe:");
        gestao.removerContato("João");


        // Exibindo todos os contatos após remoções
        System.out.println("\nExibindo todos os contatos após remoções:");
        gestao.exibirContatos();
    }
}
