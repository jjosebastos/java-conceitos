import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("Digite seu nome: ");
        String name = sc.next();

        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double height = sc.nextDouble();

        System.out.println("Seu nome é: " + name);
        System.out.println("Sua idade é: " + age);
        System.out.println("Sua altura é: " + height);


    }
}
