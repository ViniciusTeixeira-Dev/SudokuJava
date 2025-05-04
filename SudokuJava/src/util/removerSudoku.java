package util;

public class removerSudoku {

    public boolean removerNumero(int[][] matrizOriginal,int linha,int coluna){
        return matrizOriginal[linha - 1][coluna - 1] == 0;
    }
}
