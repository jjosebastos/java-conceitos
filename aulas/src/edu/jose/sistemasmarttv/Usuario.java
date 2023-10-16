package edu.jose.sistemasmarttv;

public class Usuario {
        public static void main(String[] args) {
            SmartTv smartTv = new SmartTv();

            System.out.println("TV ligada? " +smartTv.ligada);
            System.out.println("Canal Atual: "+ smartTv.canal);
            System.out.println("Volume Atual: " + smartTv.volume);
            
            smartTv.ligar();
            System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

            smartTv.desligar();
            System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
            
            smartTv.aumentarVolume();
            System.out.println("Volume: " + smartTv.volume);

            smartTv.diminuirVolume();
            System.out.println("Volume: " + smartTv.volume);

            smartTv.aumentarCanal();
            System.out.println("Canal: " + smartTv.canal);

            smartTv.diminuirCanal();
            System.out.println("Canal: " + smartTv.canal);

            smartTv.escolherCanal(13);
            System.out.println("Canal escolhido: " + smartTv.canal);
        }
}   
