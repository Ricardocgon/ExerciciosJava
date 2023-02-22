package edu.ricardo.collections;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set<Double> notas  = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);

        System.out.println("Confira se há nota 5.0: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma de todos as notas: " + soma);




    }
}
