package edu.jose.operadores;

import javax.print.DocFlavor.STRING;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        int inc = 0;
        boolean presente = true;
        int a = 5, b = 8, c = 10;
        

        // relacionais 
        String nomeUm = new String ("José");
        String nomeDois = "José";

        System.out.println(nomeDois.equals(nomeUm));

        boolean simNao = a == b;
        System.out.println(simNao);

        // operadores lógicos 
        if ( a <= 5 && c > a) System.out.println("Primeira exepressão com 'E' é verdadeira"); 
        if ( a > 5 || c < a) System.out.println("Primeira exepressão com 'OU' é false"); 


        // Operador ternário
        String resultado = a != b ? "verdadeiro" : "falso";

            // incremento
            System.out.println(numero++);

            // decremento
            System.out.println(--inc);
            
            // not
            System.out.println(!presente);
            
            // ternário
            System.out.println(resultado);

    }
}
