import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
        	String line = reader.readLine();
        	
        	while(line != null) {
        		System.out.println(line);
        		line = reader.readLine();
        	}
			
        	System.out.println("\nLeitura do arquivo concluída.");
		} catch (Exception e) {
			System.out.println("Houve algo de errado com a leitura do arquivo!");
		} 
    }
}