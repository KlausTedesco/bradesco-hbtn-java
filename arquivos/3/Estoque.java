/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Estoque {

	private int proximoId;
	private String nomeArquivo;
	private List<Produto> produtos = new ArrayList<Produto>(); 
	
	public Estoque(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		lerArquivo(nomeArquivo);
		this.proximoId = obterUltimoId();
	}

	private int obterUltimoId() {
        Optional<Produto> ultimoProduto = this.produtos.stream()
                .reduce((first, second) -> second);
        if (!ultimoProduto.isPresent()) {
        	System.err.println("Erro ao obter ultimo ID.");
        }
		return ultimoProduto.get().getId();
	}

	public void adicionarProduto(String nome, int quantidade, double preco) {
		if (quantidade < 0) {
			System.err.println("Entrada inválida. Por favor, digite uma quantidade MAIOR ou IGUAL a zero.");
		} else if (preco <= 0) {
			System.err.println("Entrada inválida. Por favor, digite um valor MAIOR que zero.");
		} else {
			Produto produto = new Produto(novoId(), nome, quantidade, preco);
			this.produtos.add(produto);
			
			escreverArquivo(this.nomeArquivo);
		}		
	}

	private int novoId() {
		return ++this.proximoId;
	}

	private int idToIndex(int id) {
		Optional<Produto> produtoOp = this.produtos.stream().filter(p -> p.getId() == id).findFirst();
		
		if(!produtoOp.isPresent()) {
			return -1;
		}
		return this.produtos.indexOf(produtoOp.get());	
	}

	public void excluirProduto(int idExcluir) {
		int posicao = idToIndex(idExcluir);
		
		if (posicao == -1) {
			System.err.println("Entrada inválida. Por favor, digite o ID correto.");
		} else {
			this.produtos.remove(posicao);
			escreverArquivo(this.nomeArquivo);			
		}
	}

	public void exibirEstoque() {
		for (Produto produto: this.produtos) {
			System.out.println(produto.toString());
		}
	}

	public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
		int posicao = idToIndex(idAtualizar);
		if (novaQuantidade < 0) {
			System.err.println("Entrada inválida. Por favor, digite uma quantidade MAIOR ou IGUAL a zero.");
		} else if (posicao == -1) {
			System.err.println("Entrada inválida. Por favor, digite o ID correto.");
		} else {
			Produto produto = this.produtos.get(posicao);
			produto.setQuantidade(novaQuantidade);
			
			escreverArquivo(this.nomeArquivo);
		}		
	}
	
	private void lerArquivo(String nomeArquivo) {
		try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha = leitor.readLine();
			while (linha != null) {
				String[] list = linha.trim().split(",");
				Produto produto = new Produto(
						Integer.valueOf(list[0]).intValue(), 	// id
						list[1], 							 	// nome
						Integer.valueOf(list[2]).intValue(), 	// quantidade
						Double.valueOf(list[3]).doubleValue()); // preco
				this.produtos.add(produto);
				linha = leitor.readLine();
			}
	        
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado: " + e.getMessage());
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        
        } catch (SecurityException e) {
            System.err.println("Erro de segurança: " + e.getMessage());       

        } catch (Exception e) {
			System.err.println("Houve algo de errado com a leitura do arquivo!");
		
        } 		
	}
	
	private void escreverArquivo(String nomeArquivo) {
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))){
	    	for (Produto produto: this.produtos) {
	    		String conteudo = produto.toCsv();
	    		escritor.write(conteudo);
	    		escritor.newLine();
	    	}
	    	escritor.flush();
        } catch (Exception e) {
			System.err.println("Erro ao gravar arquivo!");
			
		} 
	}
	
}
*/