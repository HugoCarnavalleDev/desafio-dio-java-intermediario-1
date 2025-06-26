package edu.iphone.navegadorinternet;

public interface INavegadorInternet {
    // Web Browser
    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();

    public void ampliarPagina();
    public void diminuirPagina();
    public void fecharAba();

    // Emails
    public void receberEmail();
    public void enviarEmail();

    // Google Maps
    public void pesquisarEndereco();
    public void imagemSatelite();
}