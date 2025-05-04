package model;

public class Sudoku {
    private int linhas;
    private int colunas;

    public Sudoku(int dimensao) {
        this.linhas = dimensao;
        this.colunas = dimensao;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

}
