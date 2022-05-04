import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = teclado.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = teclado.nextInt();

        int[][] mat = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }

        System.out.print("Digite o número a ser procurado: ");
        int n = teclado.nextInt();


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (mat[i][j] == n) {
                    System.out.println("Position " + i + "," + j);

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }

            }
        }
    }
}



