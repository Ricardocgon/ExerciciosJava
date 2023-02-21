import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int cont = 0;


        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                consoantes [cont] = letra;
                quantidadeConsoantes++;
            }
            cont++;
        } while(cont < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) {
            if (consoante != null)
                System.out.println(consoante + " ");
            
        }





    }
}
