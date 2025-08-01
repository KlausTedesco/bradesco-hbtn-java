import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
        public static void main(String[] args) {
        String fileName = "funcionarios.csv"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
        	String line = reader.readLine();
                    	
        	while(line != null) {
                String[] list = line.trim().split(",");
                System.out.println("Funcionário: "+list[0]);
                System.out.println("Idade: "+list[1]);
                System.out.println("Departamento: "+list[2]);
                System.out.println("Salarial: "+list[3]);
                System.out.println("------------------------");
        		line = reader.readLine();
        	}
			System.out.println("Leitura do arquivo concluída.");
        
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado: " + e.getMessage());
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        
        } catch (SecurityException e) {
            System.err.println("Erro de segurança: " + e.getMessage());       

        } catch (Exception e) {
			System.err.println("Houve algo de errado com a leitura do arquivo!");
		
        } 
    }
}
