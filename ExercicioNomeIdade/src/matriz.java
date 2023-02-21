import java.util.Random;

public class matriz {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4];

        for (int cont = 0;cont < M.length;cont++){
            for (int j = 0; j < M[cont].length; j++){
                M[cont][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int [] linha : M ) {
            for (int coluna : linha) {
                System.out.println (coluna + " ");
            }
            System.out.println();
        }

    }
}
