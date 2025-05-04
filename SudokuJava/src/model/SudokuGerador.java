package model;

public abstract interface SudokuGerador {

    int[][] gerarMatriz();

    default int getDimensao(){
        return 9;
    }


}
