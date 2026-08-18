public class MeuVetor {
    private int[] elementos;
    private int tamanho; // Controla quantos elementos reais existem

    public MeuVetor(int capacidadeInicial) {
        this.elementos = new int[capacidadeInicial];
        this.tamanho = 0;
    }

    // TODO 1: Implementar método para adicionar um elemento ao final
    // Lembre-se de verificar se há espaço antes de adicionar!
    public void adicionar(int elemento) {
        if (elementos.length == tamanho) {
            garantirEspaco();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    // TODO 2: Implementar método que dobra o tamanho do array caso esteja cheio
    private void garantirEspaco() {
        int[] novoVetor = new int[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novoVetor[i] = elementos[i];
        }
        elementos = novoVetor;
    }

//    sim fiz um obterTodos tambem
    public void obterTodos() {
        System.out.print("------------------\n[ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + ", ");
        }
        System.out.print("]\n------------------\n");
    }

    // TODO 3: Retornar o elemento de uma posição específica
    // Tratar erro se a posição for inválida!
    public int obter(int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("O índice está fora do limite.");
            return -1;
        }
        System.out.println("Índice " + posicao + " removido.");
        return elementos[posicao];
    }

    // TODO 4: Remover elemento de uma posição
    // Dica: Após remover, você precisa "deslocar" os elementos da direita para a esquerda.
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("O índice está fora do limite.");
            return;
        }

        for (int i = posicao + 1; i < tamanho; i++) {
            elementos[i - 1] = elementos[i];
        }
        elementos[tamanho] = 0;
        tamanho--;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    // ==================== DESAFIOS BÔNUS ====================
    // Os métodos abaixo NÃO são obrigatórios. Implemente-os apenas
    // se terminar os métodos acima antes do restante da turma.

    // BÔNUS 1: Adicionar um elemento em uma posição (índice) específica,
    // deslocando os elementos seguintes para a direita.
    // Dica: é o "inverso" do remover — você desloca da direita para a esquerda
    // para abrir espaço, em vez de fechar espaço.
    public void adicionarNoIndice(int indice, int elemento) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("O índice está fora do limite.");
            return;
        }
        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = elemento;
        tamanho++;

    }

    // BÔNUS 2: Remover a PRIMEIRA ocorrência de um valor (não de uma posição!).
    // Dica: primeiro descubra o índice do valor, depois reaproveite a lógica do remover().
    public void removerPorValor(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                remover(i);
                System.out.println("Valor removido");
                return;
            }
        }
        System.out.println("Valor não encontrado no vetor.");
    }

    // BÔNUS 3: Verificar se um valor existe no vetor.
    public boolean contem(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) return true;
        }
        return false;
    }

    // BÔNUS 4: Sobrescrever o toString() para listar os elementos de forma legível,
    // por exemplo: "[10, 20, 30]". Use isso no lugar de um método "listar()" separado.
    @Override
    public String toString() {
        String variavel = "[ ";
        for (int i = 0; i < tamanho; i++) {
            variavel += String.valueOf(elementos[i]) + ", ";
        }

        return variavel + "]";
    }
}