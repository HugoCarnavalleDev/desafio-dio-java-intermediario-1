package edu.iphone.navegadorinternet;

public interface INavegadorInternet {
    void abrirPagina(String url);
    
    void fecharPagina();
    
    String obterTituloPaginaAtual();
    
    String obterConteudoPaginaAtual();
    
    void navegarPara(String url);
    
    void recarregarPagina();
    
    boolean estaPaginaCarregada();
    
    String obterHistoricoNavegacao();
}