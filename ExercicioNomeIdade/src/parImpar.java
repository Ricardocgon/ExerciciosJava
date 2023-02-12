import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantnumeros;
        int numero;
        int cont = 0;

        int quantpares =0;
        int quantimpar = 0;


        System.out.println("Quantidade de números: ");
        quantnumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            cont += 1;

            if (numero % 2 == 0){
                quantpares = quantpares + 1;
            } else quantimpar = quantimpar + 1;


        } while (cont < quantnumeros);

        System.out.println("A quantidade de números de pares é de: " + quantpares + ".");
        System.out.println("A quantidade de números ímpares é de : " + quantimpar + ".");


    }
}
