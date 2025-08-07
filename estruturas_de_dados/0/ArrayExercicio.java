/*import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;
        String valoresDigitados = "";


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número "+(i+1)+": ");
			int numero = scanner.nextInt();
			numeros[i]=numero;
		}

        // Exibindo os resultados        
        System.out.println("\n \nConteúdo do array:");
        for (int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			valoresDigitados += numero+" ";
			soma += numero;
			if( numeros[i]>maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
        System.out.println(valoresDigitados);
        System.out.println("Soma de todos os números: "+soma);
        System.out.println("Maior número no array: "+maiorNumero);
        
        // Fechando o scanner
        scanner.close();
    }
}*/