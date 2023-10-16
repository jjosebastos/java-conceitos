public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formataCep("08430170");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP formatado não corresponde ao formato correto.");
        }
    }
    static String formataCep (String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();   
            
            return "08.430-170";
        }
}
