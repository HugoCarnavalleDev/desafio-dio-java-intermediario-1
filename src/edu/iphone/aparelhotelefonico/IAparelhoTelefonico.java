package edu.iphone.aparelhotelefonico;

public interface IAparelhoTelefonico {
    // Ligações
    public void realizarLigacao(String numero);
    public void atenderLigacao();
    public void iniciarCorreioVoz();

    public void sincronizarContatos();
    public void recusarLigacao();
    public void finalizarLigacao();
    public void ligacaoEmEspera();
    public void ligacaoEmConferencia();
    public void ligacaoPrivada();
    public void adicionarFavoritos();
    public void removerFavoritos();

    // SMS
    public void receberMensagem();
    public void enviarMensagem();

    // Fotos
    public void enviarFoto();
}