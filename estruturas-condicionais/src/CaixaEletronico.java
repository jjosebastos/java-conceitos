
import java.util.Scanner;;

public class CaixaEletronico {
    public static void main (String [] args) {
        
        Scanner scn = new Scanner(System.in);

        double saldo = 240;
        double saque = 0;

        System.out.println("Digite o valor do saque: ");
        double valorSolicitado = scn.nextDouble();

         
        if (saldo >= valorSolicitado) {
            saque = saldo - valorSolicitado;
            System.out.println("Saldo atualizado: "+saque);
        } else 
            System.out.println("Sem saldo");
        

    }
}   