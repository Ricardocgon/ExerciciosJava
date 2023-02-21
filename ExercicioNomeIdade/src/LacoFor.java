import java.util.Scanner;

public class LacoFor {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        double x=0;
        double contPositivos=0;
        double soma=0;

        for (cont=0;cont <6;cont++) {
           System.out.println("digite: ");
           x = leitor.nextDouble();


           if (x > 0){
               soma += x;
               contPositivos++;
           }
        }

        media = soma / contPositivos;

        System.out.println(contPositivos + " números positivos.");
        System.out.println(String.format("%.1f" , media));



    }
}




