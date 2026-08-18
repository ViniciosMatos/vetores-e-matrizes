public class MainMatriz {
    public static void main(String[] args) {
        System.out.println("=== Testando métodos obrigatórios ===");

        MinhaMatriz matriz = new MinhaMatriz(2, 3);

        // TODO 1: setValor()
        matriz.setValor(0, 0, 1);
        matriz.setValor(0, 1, 2);
        matriz.setValor(0, 2, 3);
        matriz.setValor(1, 0, 4);
        matriz.setValor(1, 1, 5);
        matriz.setValor(1, 2, 6);

        // TODO 2: getValor()
        System.out.println("Valor em (1,2) esperado 6: " + matriz.getValor(1, 2));

        // TODO 3: preencher()
        MinhaMatriz matrizPreenchida = new MinhaMatriz(2, 2);
        matrizPreenchida.preencher(7);
        System.out.println("Valor em (0,0) após preencher(7), esperado 7: " + matrizPreenchida.getValor(0, 0));
        System.out.println("Valor em (1,1) após preencher(7), esperado 7: " + matrizPreenchida.getValor(1, 1));

        System.out.println("\n=== Testando métodos BÔNUS ===");

        // BÔNUS 4: obterMaior()
        System.out.println("Maior valor da matriz (esperado 6): " + matriz.obterMaior());

        // BÔNUS 5: obterMenor()
        System.out.println("Menor valor da matriz (esperado 1): " + matriz.obterMenor());

        // BÔNUS 2: somarLinha()
        System.out.println("Soma da linha 0 (esperado 6, pois 1+2+3): " + matriz.somarLinha(0));

        // BÔNUS 3: somarColuna()
        System.out.println("Soma da coluna 0 (esperado 5, pois 1+4): " + matriz.somarColuna(0));

        // BÔNUS 6: calculaMedia()
        System.out.println("Média da matriz (esperado 3.5): " + matriz.calculaMedia());

        // BÔNUS 1: somar()
        MinhaMatriz outra = new MinhaMatriz(2, 3);
        outra.preencher(1); // matriz toda com 1
        MinhaMatriz resultado = matriz.somar(outra);
        if (resultado != null) {
            System.out.println("Valor em (0,0) apos somar (esperado 2): " + resultado.getValor(0, 0));
        }

        // BÔNUS 7: toString() / listar
        System.out.println("Matriz final:\n" + matriz);
    }
}