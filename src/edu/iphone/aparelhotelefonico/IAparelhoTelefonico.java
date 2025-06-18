package edu.iphone.aparelhotelefonico;

public interface IAparelhoTelefonico {

    void fazerChamada(String numero);
    
    void atenderChamada();
    
    void encerrarChamada();
    
    boolean estaEmChamada();
    
    String obterNumeroAtual();
}