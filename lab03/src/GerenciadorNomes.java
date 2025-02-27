import java.util.List;

public interface GerenciadorNomes {
    //constantes e assinaturas de método
    int MAX_CARACTERES_NOMES = 20;
    List<String> obterNomes();

    void adicionarNome(String nome);
}