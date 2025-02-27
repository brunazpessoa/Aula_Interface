import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class GerenciadorNomesArq implements GerenciadorNomes {
    @Override
    public List<String> obterNomes(){
        Path path = Paths.get("nomes.txt");
		try {
			byte[] bs = Files.readAllBytes(path);
			List<String> strings = Files.readAllLines(path);
			return strings;
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
    }
    @Override
    public void adicionarNome(String nome){
        
	}
    
}