import java.util.LinkedList;

public class Fila {

	private LinkedList<Integer> fila;
	private int limite;
	
	private static final int ZERO = 0; 
	
	public Fila() {
		this.fila = new LinkedList<Integer>();
	}
	
	public synchronized void adicionar(int item) throws InterruptedException {
		while(isFilaCheia()) {
			wait();
		}
		this.fila.add(item);	
    	System.out.println("Produziu: " + item);

		notify();
	}
	
	public synchronized void remover() throws InterruptedException {
		while(isFilaVazia()) {
			wait();
		}
		System.out.println("Status fila: " + this.fila.toString());
		
		this.fila.remove();
		System.out.println("Consumiu");

		notify();
	}
	
	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public boolean isFilaCheia() {
		if(getLimite() <= this.fila.size()) {
			return true;
		}
		return false;
	}
	
	public boolean isFilaVazia() {
		if(ZERO == this.fila.size()) {
			return true;
		}
		return false;
	}
	
}
