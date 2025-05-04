package util;

public class inserirSudoku {

    public boolean verificarSePodeInserir(int[][] matriz, int linha, int coluna, int valor){
        if(valor < 1 || valor > 9){
            return false;
        }
        if(linha > 9 || coluna > 9){
            return false;
        }
        if(matriz[linha - 1][coluna - 1] != 0){
            return false;
        }

        return true;
    }
}
