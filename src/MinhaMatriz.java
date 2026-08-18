public class MinhaMatriz {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public MinhaMatriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    // TODO 1: Inserir um valor em uma linha e coluna específicas
    public void setValor(int linha, int coluna, int valor) {
        if (linha < 0 || linha > linhas){
            System.out.println("Linha inserida está fora do limite desta matriz");
            return;
        }
        if (coluna < 0 || coluna > linhas){
            System.out.println("Coluna inserida está fora do limite desta matriz");
            return;
        }
        dados[linha][coluna] = valor;
    }

    // TODO 2: Retornar o valor de uma coordenada
    public int getValor(int linha, int coluna) {
        if (linha < 0 || linha > linhas){
            System.out.println("Linha inserida está fora do limite desta matriz");
            return -1;
        }
        if (coluna < 0 || coluna > linhas){
            System.out.println("Coluna inserida está fora do limite desta matriz");
            return -1;
        }
//        System.out.println(dados[linha][coluna]);
        return dados[linha][coluna];
    }

    // TODO 3: Preencher a matriz inteira com um valor padrão
    public void preencher(int valorPadrao) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = valorPadrao;
            }
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    // ==================== DESAFIOS BÔNUS ====================
    // Os métodos abaixo NÃO são obrigatórios. Implemente-os apenas
    // se terminar os métodos acima antes do restante da turma.

    // BÔNUS 1: Retornar uma nova matriz que seja a soma desta com outra matriz fornecida.
    // Dica: valide antes se as duas matrizes têm as mesmas dimensões.
    public MinhaMatriz somar(MinhaMatriz outra) {
        if (outra.getLinhas() != this.linhas || outra.getColunas() != this.colunas) {
            System.out.println("Não foi possível somar, a dimensão das matrizes são diferentes.");
            return null;
        }
        MinhaMatriz matrizSomada = new MinhaMatriz(this.linhas, this.colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSomada.dados[i][j] = this.dados[i][j] + outra.dados[i][j];
            }
        }

        return matrizSomada;
    }

    // BÔNUS 2: Somar todos os valores de uma linha específica.
    public int somarLinha(int linha) {
        if (linha < 0 || linha > linhas){
            System.out.println("Linha inserida está fora do limite desta matriz");
            return -1;
        }
        int soma = 0;

        for (int i = 0; i < colunas; i++) {
            soma += dados[linha][i];
        }

        return soma;
    }

    // BÔNUS 3: Somar todos os valores de uma coluna específica.
    public int somarColuna(int coluna) {
        if (coluna < 0 || coluna > linhas){
            System.out.println("Coluna inserida está fora do limite desta matriz");
            return -1;
        }
        int soma = 0;

        for (int i = 0; i < linhas; i++) {
            soma += dados[i][coluna];
        }

        return soma;
    }

    // BÔNUS 4: Retornar o maior valor de toda a matriz.
    public int obterMaior() {
        int maiorValor = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (dados[i][j] > maiorValor) maiorValor = dados[i][j];
            }
        }

        return maiorValor;
    }

    // BÔNUS 5: Retornar o menor valor de toda a matriz.
    public int obterMenor() {
        int menorValor = dados[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (dados[i][j] < menorValor) menorValor = dados[i][j];
            }
        }

        return menorValor;
    }

    // BÔNUS 6: Calcular a média de todos os valores da matriz.
    public double calculaMedia() {
        int quantidadeValores = 0;
        double somaTotal = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                quantidadeValores++;
                somaTotal += dados[i][j];
            }
        }
        return somaTotal/quantidadeValores;
    }

    // BÔNUS 7: Sobrescrever o toString() para listar a matriz linha por linha,
    // por exemplo:
    // 1 2 3
    // 4 5 6
    // 7 8 9
    @Override
    public String toString() {
        for (int i = 0; i < linhas; i++){
            System.out.print("[ ");
            for (int j = 0; j < colunas; j++) {
                System.out.printf(dados[i][j] + " ");
            }
            System.out.println("]");
        }
        return "";
    }
}