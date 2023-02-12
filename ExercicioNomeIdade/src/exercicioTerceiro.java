import java.util.Scanner;

public class exercicioTerceiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int cont = 0;

        do {
            System.out.println("Digite uma nota: ");
            num = scan.nextInt();
            cont = cont + 1;
        } while (cont < 5);



    }
}
