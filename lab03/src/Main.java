public class Main {
    public static void man(String[] args) {
        GerenciadorNomes gNomes = new GerenciadorNomesArq();
        Ihm ihm = new Ihm(gNomes);
        ihm.dialogar();
    }
}