import java.util.Random;
import java.util.Scanner;

public class numeroAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int [] numerosAleatorios = new int [20];

        int cont = 0;
        for (cont =0; cont < numerosAleatorios.length; cont++){
            int numero = random.nextInt(100);
            numerosAleatorios [cont] = numero;
        }

        System.out.print("Numéros aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores: ");
        for (int numero : numerosAleatorios ) {
            System.out.print(numero + 1 + " ");
        }

        System.out.print("\nAntecessores: ");
        for (int numero : numerosAleatorios ) {
            System.out.print(numero -1 + " ");
        }

    }
}
