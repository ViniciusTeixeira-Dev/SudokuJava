package util;

public class verificarSudoku {

    public boolean certoOuErrado(int[][] matriz){
        for (int linha = 0; linha < 9; linha++) {
            for (int coluna = 0; coluna < 9; coluna++) {
                int valorAtual = matriz[linha][coluna];

                if(valorAtual == 0){
                    return false;
                }

                // Verifica Linhas
                for (int x = valorAtual; x < 9; x++) {
                    if(x != linha && valorAtual == matriz[x][coluna]){
                        return false;
                    }
                }
                // Verifica Colunas
                for (int y = valorAtual; y < 9; y++) {
                    if(y != coluna && valorAtual == matriz[linha][y]){
                        return false;
                    }
                }

                // Cria um 3x3 a partir da matriz 9x9 e verifica se ha o mesmo numero repetido dentro desse 3x3
                if(linha % 3 == 0 && coluna % 3 == 0){
                    for(int i = 0; i < 3; i++ ){
                        for(int j = 0; j < 3;j++){
                            int currentLinha = linha + i;
                            int currentColuna = coluna + j;

                            // Ignora a própria célula que está sendo verificada
                            if (!(currentLinha == linha && currentColuna == coluna)
                                    && valorAtual == matriz[currentLinha][currentColuna]) {
                                return false;
                            }
                        }
                    }
                }

            }
        }
        return true;
    }

}
