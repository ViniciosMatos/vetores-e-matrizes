public class MainVetor {
    public static void main(String[] args) {
        MeuVetor vetor = new MeuVetor(2); // capacidade inicial pequena de propósito, para forçar o crescimento


        vetor.adicionar(0);
        vetor.adicionar(1);
        vetor.adicionar(2);
        vetor.adicionar(3);
        vetor.adicionar(4);



        vetor.obterTodos();
        vetor.remover(0);
        vetor.obterTodos();
        System.out.println(vetor.getTamanho());

        vetor.adicionarNoIndice(2,80);
        System.out.println(vetor);
        System.out.println(vetor.getTamanho());
    }
}