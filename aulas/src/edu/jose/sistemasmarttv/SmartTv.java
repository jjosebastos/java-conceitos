package edu.jose.sistemasmarttv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void escolherCanal (int numeroCanal){
        canal = numeroCanal;
    }

    public void ligar() {
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        volume = volume + 5;
    }

    public void diminuirVolume(){
        volume = volume - 5;
    }

    public void aumentarCanal(){
        canal++;
    } 

    public void diminuirCanal(){
        canal--;
    } 
}
