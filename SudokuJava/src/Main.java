import model.*;
import util.inserirSudoku;
import util.printSudoku;
import util.removerSudoku;
import util.verificarSudoku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("**** SUDOKU ****");
            System.out.println("Digite uma opcão: ");
            System.out.println("1 - Facil " + "\n" + "2 - Medio" + "\n" + "3 - Dificil" + "\n" + "-1 - Sair");

            SudokuGerador dificuldade = null;
            int opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    dificuldade = new SudokuFacil();
                    break;
                case 2:
                    dificuldade = new SudokuMedio();
                    break;
                case 3:
                    dificuldade= new SudokuDificil();
                    break;
                case -1:
                    System.exit(0);
                default:
                    System.out.println("Digite um valor correto !");
                    continue;
            }

            Sudoku sudoku = new Sudoku(dificuldade.getDimensao());
            int[][] matrizUsuario = dificuldade.gerarMatriz();
            int[][] matrizOriginal = dificuldade.gerarMatriz();
            boolean jogo = true;

            do{
                printSudoku printSudoku = new printSudoku();
                System.out.printf(printSudoku.printCelula(matrizUsuario));

                System.out.println("Digite a opcao: ");
                System.out.println("1 - Verificar Situação " + "\n" + "2 - Inserir um numero" + "\n" + "3 - Remover um numero" + "\n" + "4 - Sair");
                opcao = teclado.nextInt();

                switch (opcao){
                    case 1:
                        verificarSudoku verificarSudoku = new verificarSudoku();
                        if(!verificarSudoku.certoOuErrado(matrizUsuario)){
                            System.out.println("Errado ! não atende as regras.");
                            break;
                        }
                        System.out.println("Parabens você completou todos os requisitos");
                        jogo = false;
                        break;

                    case 2:
                        System.out.println("Digite o numero da linha");
                        int linha = teclado.nextInt();

                        System.out.println("Digite o numero da coluna");
                        int coluna = teclado.nextInt();

                        System.out.println("Digite o valor");
                        int valor = teclado.nextInt();

                        inserirSudoku inserirSudoku = new inserirSudoku();
                        if(!(inserirSudoku.verificarSePodeInserir(matrizUsuario, linha,coluna,valor))){
                            System.out.println("Não foi possivel inserir! local ocupado ou valor incorreto.");
                            break;
                        }
                        System.out.println("Numero inserido com sucesso");
                        matrizUsuario[linha - 1][coluna - 1] = valor;
                        break;

                    case 3:
                        System.out.println("Digite o numero da linha");
                        int linhaRemover = teclado.nextInt();

                        System.out.println("Digite o numero da coluna");
                        int colunaRemover = teclado.nextInt();

                        removerSudoku removerSudoku = new removerSudoku();
                        if(!removerSudoku.removerNumero(matrizOriginal, linhaRemover, colunaRemover)){
                            System.out.println("Numero original! não foi possivel retirar.");
                            break;
                        }
                        matrizUsuario[linhaRemover - 1][colunaRemover - 1] = 0;
                        System.out.println("Numero retirado com sucesso");
                        break;

                    case 4:
                        jogo = false;
                        break;
                }
            }while(jogo);

        }while(true);
    }
}
