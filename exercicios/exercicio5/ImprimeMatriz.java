package br.com.ntconsult.exercicios.exercicio5;

public class ImprimeMatriz {

    public static int[][] geraMatrizIdentidade(int n) {
        int[][] matrizIdentidade = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrizIdentidade[i][i] = 1;
        }

        return matrizIdentidade;
    }

    public static void main(String[] args) {
        int n = 5; // Tamanho da matriz identidade desejada
        int[][] matrizIdentidade = geraMatrizIdentidade(n);

        System.out.println("Matriz Identidade:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }
    }
 }