package edu.jose.sistemasmarttv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 100;

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
        if (volume >= 100) {
            
        } else {
            volume = volume + 5;
        }
        
    }

    public void diminuirVolume(){
        if (volume <= 0);  else volume = volume - 5;
    }

    public void aumentarCanal(){
        if (canal >= 100); 
        else canal++;
    }
    

    public void diminuirCanal(){
        canal--;
    } 


}
