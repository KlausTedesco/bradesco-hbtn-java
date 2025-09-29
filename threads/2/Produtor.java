import java.util.Random;

public class Produtor extends Thread {
  
	private Fila fila;
	private Random random;
	
    public Produtor(Fila fila) {
    	this.fila = fila;
    	this.random = new Random();
	}

	@Override
    public void run() {
        try {
        	while (true) {            			
        		int num = this.random.nextInt(100);
        		Thread.sleep(1000);    
            	this.fila.adicionar(num);
        	}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	
}