import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int [] vetor = {-17, 5, 31, 8, 1, -8};
        //o vetor começa na posição "0". No caso acima, são 5 posições; 0,1,2,3,4,5.


        System.out.println("O comprimento do vetor é : " + vetor.length);
        //comprimento do vetor

        System.out.println("Vetor na ordem de criação: ");
        int cont = 0;
        while (cont < (vetor.length)){
            System.out.println(vetor [cont] + " ");
            cont ++;
        }

        System.out.println("Vetor na ordem inversa: ");
        int cont1 = 0;
        for (cont1 = (vetor.length - 1);cont1 >=0;cont1-- ){
            System.out.println(vetor [cont1] + " ");
        }


    }


}
