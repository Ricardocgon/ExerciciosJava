import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont;

        System.out.println("Digite o número para a tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for (cont=1;cont <=10;cont++) {

            System.out.println(numero + " X " + cont + " = " + (numero * cont) );

        }


    }
}
