package edu.iphone.smartphone;

import edu.iphone.aparelhotelefonico.IAparelhoTelefonico;
import edu.iphone.navegadorinternet.INavegadorInternet;
import edu.iphone.reprodutormusical.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Implementação dos métodos da interface IReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }
    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reproduzindo vídeo...");
    }
    @Override
    public void widescreenModo() {
        System.out.println("Ativando modo widescreen...");
    }
    @Override
    public void telaCheia() {
        System.out.println("Ativando tela cheia...");
    }
    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }
    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume...");
    }
    @Override
    public void proximaMusica() {
        System.out.println("Tocando próxima música...");
    }
    @Override
    public void musicaAnterior() {
        System.out.println("Tocando música anterior...");
    }
    @Override
    public void flipAlbum() {
        System.out.println("Virando álbum...");
    }
    @Override
    public void avaliarMusica() {
        System.out.println("Avaliando música...");
    }
    @Override
    public void modoHorizontal() {
        System.out.println("Ativando modo horizontal...");
    }
    @Override
    public void modoVertical() {
        System.out.println("Ativando modo vertical...");
    }

    // Implementação dos métodos da interface IAparelhoTelefonico
    @Override
    public void realizarLigacao(String numero) {
        System.out.println("Realizando ligação para o número: " + numero);
    }
    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void sincronizarContatos() {
        System.out.println("Sincronizando contatos...");
    }
    @Override
    public void recusarLigacao() {
        System.out.println("Recusando ligação...");
    }
    @Override
    public void finalizarLigacao() {
        System.out.println("Finalizando ligação...");
    }
    @Override
    public void ligacaoEmEspera() {
        System.out.println("Ligação em espera...");
    }
    @Override
    public void ligacaoEmConferencia() {
        System.out.println("Ligação em conferência...");
    }
    @Override
    public void ligacaoPrivada() {
        System.out.println("Ligação privada...");
    }
    @Override
    public void adicionarFavoritos() {
        System.out.println("Adicionando aos favoritos...");
    }
    @Override
    public void removerFavoritos() {
        System.out.println("Removendo dos favoritos...");
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem...");
    }
    @Override
    public void enviarFoto() {
        System.out.println("Enviando foto...");
    }

    // Implementação dos métodos da interface INavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    
    @Override
    public void ampliarPagina() {
        System.out.println("Ampliando página...");
    }
    @Override
    public void diminuirPagina() {
        System.out.println("Diminuindo página...");
    }
    @Override
    public void fecharAba() {
        System.out.println("Fechando aba...");
    }
    @Override
    public void receberEmail() {
        System.out.println("Recebendo email...");
    }
    @Override
    public void enviarEmail() {
        System.out.println("Enviando email...");
    }
    @Override
    public void pesquisarEndereco() {
        System.out.println("Pesquisando endereço...");
    }
    @Override
    public void imagemSatelite() {
        System.out.println("Exibindo imagem de satélite...");
    }
}