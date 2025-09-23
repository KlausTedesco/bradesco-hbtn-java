public class Principal {

	public static void main(String[] args) {
		Contador contador = new Contador();
        Thread thread1 = new ThreadContador(contador);    
        Thread thread2 = new ThreadContador(contador);
        thread1.run();
        thread2.run();
        
        System.out.println("Valor final do contador: "+ contador.getContagem());
	}
	
}
