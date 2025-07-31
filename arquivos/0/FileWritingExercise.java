/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWritingExercise {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();


     //	  Peça ao usuário para digitar várias linhas de texto (o programa deve continuar aceitando entradas até que o usuário digite “sair”).
     //   Salve cada linha de texto digitada pelo usuário no arquivo especificado.
     //   Ao final, informe ao usuário que o arquivo foi criado e seu conteúdo foi salvo com sucesso.

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
        	System.out.print("Digite seu texto (tecle 'Enter' para nova linha e digite 'sair' para finalizar): ");
        	while(scanner.hasNextLine()) {
        		String conteudo = scanner.nextLine();
        		if (conteudo.equalsIgnoreCase("sair")) {
        			break;
        		}
        		bw.write(conteudo);
        		bw.newLine();
        	}
        	System.out.println("O arquivo foi criado e seu conteúdo foi salvo com sucesso.");

        } catch (Exception e) {
			System.out.println("Erro ao gravar arquivo!");
		} 

        scanner.close();
    }

}
*/