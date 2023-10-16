public class ResultadoEscolar {
    public static void main(String [] args){

        int nota = 0;

        if (nota == 0) System.out.println("Reprovado!");
        else {
            if (nota >= 6 && nota <= 8) System.out.println("Aprovado!");

            else if (nota >= 4 && nota < 6) System.out.println("Vai precisar de recuperação.");

            else if (nota == 10) System.out.println("Excelente nota, continue assim!");
        }

        String resultado = (nota >= 7 && nota <= 10) ? "aprovado" : 
                                                                (nota < 6 && nota >= 4) ? "Recuperação": 
                                                                    nota == 0 ? "Reprovado!":"" ;
        
        System.out.println(resultado);
    }
}
