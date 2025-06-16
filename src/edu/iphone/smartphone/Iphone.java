package edu.iphone.smartphone;

import edu.iphone.aparelhotelefonico.AparelhoTelefonico;
import edu.iphone.navegadorinternet.NavegadorInternet;
import edu.iphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void tocarMusica(String musica) {
        // Implementação do método para tocar música
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        // Implementação do método para pausar música
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        // Implementação do método para parar música
        System.out.println("Música parada.");
    }

    @Override
    public void avancarMusica() {
        // Implementação do método para avançar música
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        // Implementação do método para retroceder música
        System.out.println("Retrocedendo para a música anterior.");
    }

    @Override
    public String obterInformacoesMusicaAtual() {
        // Implementação do método para obter informações da música atual
        return "Informações da música atual.";
    }

    @Override
    public void abrirPagina(String url) {
        // Implementação do método para abrir página na internet
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        // Implementação do método para fechar página na internet
        System.out.println("Página fechada.");
    }

    @Override
    public String obterTituloPaginaAtual() {
        // Implementação do método para obter título da página atual
        return "Título da página atual.";
    }

    @Override
    public String obterConteudoPaginaAtual() {
        // Implementação do método para obter conteúdo da página atual
        return "Conteúdo da página atual.";
    }

    @Override
    public void navegarPara(String url) {
        // Implementação do método para navegar para uma URL específica
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void recarregarPagina() {
        // Implementação do método para recarregar a página atual
        System.out.println("Página recarregada.");
    }

    @Override
    public boolean estaPaginaCarregada() {
        // Implementação do método para verificar
    
}

    @Override
    public void atenderChamada() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void encerrarChamada() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean estaEmChamada() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void fazerChamada(String numero) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String obterNumeroAtual() {
        // TODO Auto-generated method stub
        return null;
    }
