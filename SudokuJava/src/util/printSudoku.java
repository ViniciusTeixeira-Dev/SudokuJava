package util;

public class printSudoku {
    private boolean coordenadasCima;

    public printSudoku() {
        this.coordenadasCima = false;
    }

    public String printCelula(int[][] matriz) {
        StringBuilder sudokuString = new StringBuilder();
        int posicao = 1;

        if (!coordenadasCima) {
            int valor = matriz[0][0];
            sudokuString.append(mostrarCoordenadas(valor));
        }

        for (int linha = 0; linha < 9; linha++) {
            for (int coluna = 0; coluna < 9; coluna++) {
                int valor = matriz[linha][coluna];

                if (posicao % 27 == 0 && posicao < 81) {
                    if(posicao/9 != 1){
                        sudokuString.append(valor).append(" |").append("\n").append("  +-------+-------+-------+").append("\n").append(posicao/9 + 1).append(" | ");
                    }
                }

                else if(posicao % 9 == 0){
                    if(posicao == 81){
                        sudokuString.append(valor).append(" | ").append("\n").append("  +-------+-------+-------+").append("\n");
                    }
                    else{
                        sudokuString.append(valor).append(" | ").append("\n").append(posicao/9 + 1).append(" | ");
                    }
                }
                else if(posicao % 3 == 0){
                    sudokuString.append(valor).append(" | ");
                }
                else{
                    sudokuString.append(valor).append(" ");
                }

                posicao++;
            }
        }
        return sudokuString.toString();
    }


    public String mostrarCoordenadas (int valor) {
        StringBuilder coordenadasCima = new StringBuilder("    ");

        for (int i = 1; i <= 9; i++) {
            if (i == 9) {
                coordenadasCima.append(i).append("   ").append("\n").append("  +-------+-------+-------+").append("\n").append("1 | ");
            } else if (i % 3 == 0) {
                coordenadasCima.append(i).append("   ");
            } else {
                coordenadasCima.append(i).append(" ");
            }
        }
        this.coordenadasCima = true;
        return coordenadasCima.toString();
    }
}