package edu.iphone.reprodutormusical;

public interface ReprodutorMusical {

    void tocarMusica(String musica);
    
    void pausarMusica();
    
    void pararMusica();
    
    void avancarMusica();
    
    void retrocederMusica();
    
    String obterInformacoesMusicaAtual();  
}