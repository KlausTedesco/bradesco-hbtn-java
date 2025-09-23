/*public class ProdutorConsumidor {
	
	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer();

		// Criar e iniciar as threads do produtor e consumidor
		Thread consumidor = new Consumidor(buffer);
		Thread produtor = new Produtor(buffer);
		produtor.start();
		consumidor.start();

		produtor.join();
		consumidor.join();
	}
	
}*/