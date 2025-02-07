package implementation;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atentendo a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando a nova pagina!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }
}
