//public class PersonagemGame {
//
//	private static final int ZERO = 0;
//	private static final int CEM = 100;
//	private String nome;
//	private int saudeAtual;
//	public int quantidadeDeDano;
//	public int quantidadeDeCura;
//	private String status;
//	
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public int getSaudeAtual() {
//		return saudeAtual;
//	}
//	public void setSaudeAtual(int saudeAtual) {
//		this.saudeAtual = saudeAtual;
//		if(ZERO == this.saudeAtual) {
//			this.status="morto";
//		}else {
//			this.status="vivo";
//		}
//	}
//	
//	public void tomarDano(int quantidadeDeDano) {
//		int saude = this.saudeAtual-quantidadeDeDano; 			
//		if(saude < ZERO) {
//			saude = ZERO;
//		}
//		setSaudeAtual(saude);
//	}
//	public void receberCura(int quantidadeDeCura) {
//		int saude = this.saudeAtual+quantidadeDeCura; 			
//		if(saude > CEM) {
//			saude = CEM;
//		}
//		setSaudeAtual(saude);
//	}
//	
//	public String getStatus() {
//		return status;
//	}
//
//}
