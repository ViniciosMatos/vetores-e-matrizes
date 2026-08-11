//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MeuVetor vetor = new MeuVetor(10);

        vetor.adicionar(0);
        vetor.adicionar(1);
        vetor.adicionar(2);
        vetor.adicionar(3);
        vetor.adicionar(4);
        vetor.adicionar(5);
        vetor.adicionar(6);
        vetor.adicionar(7);

        vetor.remover(3);
    }
}