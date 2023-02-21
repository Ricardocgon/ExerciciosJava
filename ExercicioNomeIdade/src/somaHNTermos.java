import java.util.Scanner;

public class somaHNTermos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double h = 0;
        double n = 0;
        double soma = 0;

        System.out.println("digite: ");
        n = sc.nextDouble();

        for (double i=1;i <= n;i++)
        {
            h = 1/i;
            System.out.println(h);

            soma += h;
            System.out.println("\n"+ soma);
        }

        System.out.println(String.format("%.2f",soma));
        System.out.println(Math.round(soma));

    }
}
