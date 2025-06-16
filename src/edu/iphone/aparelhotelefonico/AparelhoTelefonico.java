package edu.iphone.aparelhotelefonico;

public interface AparelhoTelefonico {

    void fazerChamada(String numero);
    
    void atenderChamada();
    
    void encerrarChamada();
    
    boolean estaEmChamada();
    
    String obterNumeroAtual();
}