package edu.iphone.smartphone;

import edu.iphone.aparelhotelefonico.IAparelhoTelefonico;
import edu.iphone.navegadorinternet.INavegadorInternet;
import edu.iphone.reprodutormusical.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Implementação dos métodos da interface IReprodutorMusical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }
    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }
    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }
    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior.");
    }
    @Override
    public String obterInformacoesMusicaAtual() {
        return "Informações da música atual.";
    }

    // Implementação dos métodos da interface IAparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }
    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }
    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }
    @Override
    public boolean estaEmChamada() {
        return false; // Simulando que não está em chamada.
    }
    @Override
    public String obterNumeroAtual() {
        return "Número atual: 123-456-7890"; // Simulando um número de telefone.
    }

    // Implementação dos métodos da interface INavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }
    @Override
    public void fecharPagina() {
        System.out.println("Página fechada.");
    }
    @Override
    public String obterTituloPaginaAtual() {
        return "Título da página atual.";
    }
    @Override
    public String obterConteudoPaginaAtual() {
        return "Conteúdo da página atual.";
    }
    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }
    @Override
    public void recarregarPagina() {
        System.out.println("Página recarregada.");
    }
    @Override
    public boolean estaPaginaCarregada() {
        return true; // Simulando que a página está carregada.
    }
    @Override
    public String obterHistoricoNavegacao() {
        return "Histórico de navegação.";
    }
}