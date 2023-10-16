public class LacoForArray {
    public static void main(String[] args) {
        
        String array [] = {"JOSÉ", "VANESSA", "YVEN", "MARIA", "JUNIOR", "BRUNO", "CLAUDIA"};
    
        // int 
        for (int i = 0; i <= array.length; i++ ){
            System.out.println(array[i]);
        }

        // String 
        for (String aluno: array){
            System.out.println("Nome do aluno: " + aluno);
        }

    }
}
