package edu.iphone.principal;

import java.util.Scanner;
import edu.iphone.smartphone.Iphone;

public class Main {

    public static void main(String[] args) {

        String musica;
        String numero;
        String url;

        System.out.println("Bem-vindo ao sistema Iphone!");

        Scanner scan = new Scanner(System.in);   
        // Criação de um objeto Iphone     
        Iphone iphone = new Iphone();

        System.out.println("Digite o nome da música que deseja tocar:");
        musica = scan.nextLine();  

        System.out.println("Digite o número do telefone para realizar a ligação:");
        numero = scan.nextLine();

        System.out.println("Digite a URL da página que deseja exibir:");
        url = scan.nextLine();

        iphone.selecionarMusica(musica);
        iphone.realizarLigacao(numero);
        iphone.exibirPagina(url);

        scan.close();

        System.out.println("Obrigado por usar o sistema iPhone!");
    }
}