import java.util.Scanner;

public class CalculaCase {
    public static void main (String [] args){
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um operador: ");
        String operador = scn.next();
        

        System.out.println("Digite um número para o calculo: ");
        int numeroUm = scn.nextInt();
        
        System.out.println("Digite um número para o calculo: ");
        int numeroDois = scn.nextInt(); 

        double resultado = 0;

        

        switch (operador) {
            case "+": 
                resultado = numeroUm + numeroDois;
                System.out.println(resultado);
                    break;
            case "-": 
                resultado = numeroUm - numeroDois;
                System.out.println(resultado);
                    break;
            case "*":
                resultado = numeroUm * numeroDois;
                System.out.println(resultado);
                    break;
            case "/":    
                resultado = numeroUm - numeroDois;
                System.out.println(resultado);
                    break;
        
            default:
                System.out.println("Operador inválido!");
                break;
                
        }
    }
}
