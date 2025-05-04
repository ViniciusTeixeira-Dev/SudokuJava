package model;

public class SudokuFacil implements SudokuGerador {

    @Override
    public int[][] gerarMatriz() {
        return new int[][] {
                {0, 0, 4, 6, 7, 0, 9, 0, 2},
                {6, 0, 2, 1, 9, 0, 0, 4, 0},
                {0, 9, 0, 0, 4, 2, 0, 6, 7},
                {8, 0, 9, 0, 0, 0, 4, 0, 0},
                {4, 0, 0, 8, 5, 3, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 8, 0, 6},
                {9, 6, 0, 5, 0, 0, 0, 8, 0},
                {0, 8, 0, 0, 1, 9, 6, 0, 5},
                {3, 0, 5, 0, 8, 6, 1, 0, 0}
        };
    }
}
