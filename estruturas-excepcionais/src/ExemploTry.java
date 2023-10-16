import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTry {
    public static void main(String[] args) {

        try {

        
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scn.next();

        System.out.println("Digite sua idade: ");
        int idade = scn.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scn.nextDouble();


        System.out.println("Seu nome é: " + nome + "\n Sua idade é: " + idade +"\n Sua altura é: " + altura);
        scn.close();

        } catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}