public class SistemaFilas {

	public static void main(String[] args) {
		Fila filaCompatilhada = new Fila();
		filaCompatilhada.setLimite(10);
		
		Produtor thread1 = new Produtor(filaCompatilhada);
		Produtor thread2 = new Produtor(filaCompatilhada);
		
		Consumidor thread3 = new Consumidor(filaCompatilhada);
		Consumidor thread4 = new Consumidor(filaCompatilhada);
		
        try {
    		thread1.start();
    		thread2.start();
    		thread3.start();	
    		thread4.start();
    		
    		Thread.sleep(20000);
            System.out.println("Simulação concluída após 20 segundos.");
        } catch (InterruptedException e) {
            System.err.println("O programa foi interrompido durante a espera.");
            Thread.currentThread().interrupt(); 
        } finally {
            System.out.println("Encerrando o processo com System.exit(0).");
            System.exit(0);
        }
	}
}
