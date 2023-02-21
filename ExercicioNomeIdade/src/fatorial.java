import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.print("Fatorial: ");
        fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "!=");
        for (int cont = fatorial;cont >= 1;cont --){
            multiplicacao = multiplicacao * cont;
        }

        System.out.print(multiplicacao);




    }
}
