public class Principal {

	public static void main(String[] args) {
		Contador contador = new Contador();
        Thread thread1 = new ThreadContador(contador);    
        Thread thread2 = new ThreadContador(contador);
        thread1.start();
        thread2.start();
        
        System.out.println("Valor final do contador: "+ contador.getContagem());
	}
	
}
