package iphone.telefone;

import iphone.aparelhoTelefonico.Telefone;
import iphone.navegadorNaInternet.NavegadorDeInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorDeInternet, ReprodutorMusical, Telefone{
    public void ligar() {
        System.out.println("Ligando para contato...");
    }

    public void atender() {
        System.out.println("Atendendo ligacao...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void tocar() {
        System.out.println("Tocando musica...");
    }

    public void pausar() {
        System.out.println("Pausando musica...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba navegador...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
    
}
