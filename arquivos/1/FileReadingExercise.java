// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;


// public class FileReadingExercise {
//     public static void main(String[] args) {
//         String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

//         try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            
//             System.out.println("Conteúdo do arquivo '" + fileName + "':\n");
//         	String line = reader.readLine();
        	
//         	while(line != null) {
//         		System.out.println(line);
//         		line = reader.readLine();
//         	}
// 			System.out.println("\nLeitura do arquivo concluída.");
        
//         } catch (FileNotFoundException e) {
//             System.err.println("Erro: Arquivo não encontrado: " + e.getMessage());
            
//         } catch (IOException e) {
//             System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        
//         } catch (SecurityException e) {
//             System.err.println("Erro de segurança: " + e.getMessage());       
        
//         } catch (Exception e) {
// 			System.err.println("Houve algo de errado com a leitura do arquivo!");
		
//         } 
//     }
// }